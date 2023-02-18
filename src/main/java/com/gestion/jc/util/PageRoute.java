package com.gestion.jc.util;

public enum PageRoute {
    ABM_CLIENT("pages/abmClients.fxml"),
    CREATE_NEW_CLIENT("pages/createClient.fxml");

    private String route;

    PageRoute(String route) {
        this.route = route;
    }

    public String getRoute() {
        return route;
    }
}
