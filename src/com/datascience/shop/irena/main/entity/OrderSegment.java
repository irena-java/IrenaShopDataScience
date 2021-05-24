package com.datascience.shop.irena.main.entity;

import java.time.LocalDate;

public class OrderSegment {
    private long idOrderSegment;
    private com.datascience.shop.irena.main.entity.DataScienceSection dataScienceSection;
    private com.datascience.shop.irena.main.entity.DataScienceDirection dataScienceDirection;
    private com.datascience.shop.irena.main.entity.JobType jobType;
    private LocalDate startDate;
    private LocalDate deadline;
    private double price;
    private static long idCurrentOrderSegment;

    public OrderSegment(long idOrderSegment, com.datascience.shop.irena.main.entity.DataScienceSection dataScienceSection, com.datascience.shop.irena.main.entity.DataScienceDirection dataScienceDirection, com.datascience.shop.irena.main.entity.JobType jobType, LocalDate startDate, LocalDate deadline, double price) {
        this.idOrderSegment = setIdOrderSegment();
        this.dataScienceSection = dataScienceSection;
        this.dataScienceDirection = dataScienceDirection;
        this.jobType = jobType;
        this.startDate = startDate;
        this.deadline = deadline;
        this.price = price;
    }

    public long getIdOrderSegment() {
        return idOrderSegment;
    }

    public long setIdOrderSegment() {
        return idCurrentOrderSegment++;
    }

    public com.datascience.shop.irena.main.entity.DataScienceSection getDataScienceSection() {
        return dataScienceSection;
    }

    public void setDataScienceSection(com.datascience.shop.irena.main.entity.DataScienceSection dataScienceSection) {
        this.dataScienceSection = dataScienceSection;
    }

    public com.datascience.shop.irena.main.entity.DataScienceDirection getDataScienceDirection() {
        return dataScienceDirection;
    }

    public void setDataScienceDirection(com.datascience.shop.irena.main.entity.DataScienceDirection dataScienceDirection) {
        this.dataScienceDirection = dataScienceDirection;
    }

    public com.datascience.shop.irena.main.entity.JobType getJobType() {
        return jobType;
    }

    public void setJobType(com.datascience.shop.irena.main.entity.JobType jobType) {
        this.jobType = jobType;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
