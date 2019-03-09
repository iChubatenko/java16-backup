package pl.mpas.advanced_programing.generic;

public class MyStringSecret {

    private String secret;

    public MyStringSecret(String secret) {
        this.secret = secret;
    }

    public String getSecret() {
        return secret;
    }

    @Override
    public String toString() {
        return "MyStringSecret{" +
                "secret='" + secret + '\'' +
                '}';
    }
}
