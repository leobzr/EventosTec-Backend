package com.eventostec.api;

import org.flywaydb.core.Flyway;

public class FlywayRepair {
    public static void main(String[] args) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/eventostecpg", "postgres", "password")
                .load();

        flyway.repair();
    }
}

