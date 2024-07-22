package com.exampleProfile.ProfileSet.Service;

import com.exampleProfile.ProfileSet.DataSource;

public class MyService {
    private final DataSource dataSource;

    public MyService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getDataSourceInfo() {
        return dataSource.toString();
    }
}