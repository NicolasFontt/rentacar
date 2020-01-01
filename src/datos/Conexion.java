
package datos;

public class Conexion {
    private String driver ="com.mysql.jdbc.Driver";
    private String url ="jdbc:mysql://192.168.46.3:3306s/rentacar";
    private String user ="dba";
    private String password ="nicolasxd123";

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
