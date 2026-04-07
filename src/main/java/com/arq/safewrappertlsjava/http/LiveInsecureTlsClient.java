
package com.arq.safewrappertlsjava.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class LiveInsecureTlsClient {
    public HostnameVerifier verifier() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }
}
