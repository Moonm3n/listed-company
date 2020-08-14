package com.example.demo.dto;

public class TableRowData {
    private String type;
    private long data_2019;
    private long data_2018;
    private long data_2017;
    private long data_2016;
    private long data_2015;

    public TableRowData(String type, long data_2019, long data_2018, long data_2017, long data_2016, long data_2015) {
        this.type = type;
        this.data_2019 = data_2019;
        this.data_2018 = data_2018;
        this.data_2017 = data_2017;
        this.data_2016 = data_2016;
        this.data_2015 = data_2015;
    }

    public TableRowData(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getData_2019() {
        return data_2019;
    }

    public void setData_2019(long data_2019) {
        this.data_2019 = data_2019;
    }

    public long getData_2018() {
        return data_2018;
    }

    public void setData_2018(long data_2018) {
        this.data_2018 = data_2018;
    }

    public long getData_2017() {
        return data_2017;
    }

    public void setData_2017(long data_2017) {
        this.data_2017 = data_2017;
    }

    public long getData_2016() {
        return data_2016;
    }

    public void setData_2016(long data_2016) {
        this.data_2016 = data_2016;
    }

    public long getData_2015() {
        return data_2015;
    }

    public void setData_2015(long data_2015) {
        this.data_2015 = data_2015;
    }
}
