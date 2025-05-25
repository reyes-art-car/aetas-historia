package modelo;

import java.util.ArrayList;
import java.util.List;

public class SignInImpl implements SignInDao {

    private List<Usuario> usuariosRegistrados = new ArrayList<>();

    @Override
    public boolean SignIn(String nickname, String nombre, String email, String password) {
        if (nickname == null || password == null || nickname.isBlank() || password.isBlank()) {
            System.out.println("Usuario o contraseña no válidos.");
            return false;
        }

        for (Usuario u : usuariosRegistrados) {
            if (u.getNickname().equals(nickname)) {
                System.out.println("El nombre de usuario ya está registrado.");
                return false;
            }
        }

        usuariosRegistrados.add(new Usuario());
        System.out.println("Usuario registrado correctamente: " + nickname);
        return true;
    }


	
}
