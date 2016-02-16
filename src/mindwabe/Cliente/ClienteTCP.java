/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mindwabe.Cliente;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.CharBuffer;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Liuts213
 * tilizando el parte del codigo de ericblue
 */
public class ClienteTCP {

    //private static final Logger logger = Logger.getLogger(ClienteTCP.class);
    public static final String DEFAULT_HOST = "127.0.0.1";
    public static final int DEFAULT_PORT = 13854;

    private String host;
    private int port;
    private boolean connected;
    private SocketChannel channel;
    private Scanner in;

    /**
     * Default constructor using Thinkgear default host/port
     *  
     */
    public ClienteTCP() {

        this.host = DEFAULT_HOST;
        this.port = DEFAULT_PORT;
        this.connected = false;

    }

    /**
     * Constructor
     *
     * @param host
     * @param port
     */
    public ClienteTCP(String host, int port) {

        this.host = host;
        this.port = port;
        this.connected = false;

    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isConnected() {
        return this.connected;
    }

    public void connect() {
        try {
            if (!this.connected) {
                //logger.debug("connect() - Starting new connection...");
                this.channel = SocketChannel.open(new InetSocketAddress(this.host, this.port));

                CharsetEncoder enc = Charset.forName("US-ASCII").newEncoder();
                String jsonCommand = "{\"enableRawOutput\": false, \"format\": \"Json\"}\n";
                this.channel.write(enc.encode(CharBuffer.wrap(jsonCommand)));

                this.in = new Scanner(channel);
                this.connected = true;
            }
        } catch (IOException e) {
            this.connected=false;
        }

    }
    public boolean isDataAvailable() {
        if (this.connected) {
            return this.in.hasNextLine();
        } else {
            return false;
        }
    }

    public String getData() {
        return this.in.nextLine();
    }

    public void close() throws IOException {

        if (this.connected) {
            //logger.debug("close() - Closing connection...");
            this.in.close();
            this.channel.close();
            this.connected = false;
        }
    }
}
