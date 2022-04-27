package connection;

import java.io.File;

import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "datastax.astra")
public class DataStaxAStraProperties {
    private File secureConnectbundle;

    public File getSecureConnectbundle() {
        return this.secureConnectbundle;
    }

    public void setSecureConnectbundle(File secureConnectbundle) {
        this.secureConnectbundle = secureConnectbundle;
    }

}
