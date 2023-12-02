package io.github.ajvelezrueda.trino.jdbc.connector;

import io.trino.plugin.jdbc.JdbcPlugin;

public class Plugin extends JdbcPlugin {
    public Plugin() {
        super("jdbc", new ClientModule());
    }
}