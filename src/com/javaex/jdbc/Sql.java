package com.javaex.jdbc;

public class Sql {
    private StringBuilder query;

    public Sql(String query){
        this.query = new StringBuilder();
    }

    public Sql add(String addString){
        query.append(addString);
        return this;
    }

    @Override
    public String toString() {
        return query.toString();
    }
}
