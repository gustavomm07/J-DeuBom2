package com.LojaGames.MinhaLojaDeGames.service;

import java.nio.charset.Charset;
import java.util.Optional;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.LojaGames.MinhaLojaDeGames.model.UserLogin;
import com.LojaGames.MinhaLojaDeGames.model.Usuario;
import com.LojaGames.MinhaLojaDeGames.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario CadastrarUsuario(Usuario email) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();	
		
		String senhaEncoder = encoder.encode(email.getSenha());
		email.setSenha(senhaEncoder);
		
		return repository.save(email);
	}
	public Optional<UserLogin> Logar(Optional<UserLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();	
		
		Optional<Usuario> email = repository.findByEmail(user.get().getEmail());
		
		if(email.isPresent()) {
			if(encoder.matches(user.get().getSenha(), email.get().getSenha())){
				
				String auth = user.get().getEmail()+ ":" + email.get().getSenha();
				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encodedAuth);
				
				user.get().setToken(authHeader);
				user.get().setNome(email.get().getNome());
				
				return user;
			}
		}
		return null;
	}
}
