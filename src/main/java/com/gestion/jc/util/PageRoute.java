package com.gestion.jc.util;

public enum PageRoute {
    INITIAL("pages/init.fxml"),
    ABM_CLIENT("pages/abmClients.fxml"),
    CREATE_NEW_CLIENT("pages/createClient.fxml"),
    ABM_ORDER("pages/abmOrder.fxml");

    private String route;

    PageRoute(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
