package com.neuedu.po;

public class TabSpecialColumn {
    private Integer id;

    private String specialColumn;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialColumn() {
        return specialColumn;
    }

    public void setSpecialColumn(String specialColumn) {
        this.specialColumn = specialColumn == null ? null : specialColumn.trim();
    }
}