package modelo;

public class LogInDaoImpl implements LogInDao {

    // Credenciales simuladas para el ejemplo
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    @Override
    public boolean LogIn(String username, String password) {
        if (username == null || password == null) {
            System.out.println("Usuario o contraseña vacíos.");
            return false;
        }

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {
            System.out.println("Login exitoso. Bienvenido, " + username + "!");
            return true;
        } else {
            System.out.println("Credenciales incorrectas.");
            return false;
        }
    }
}
