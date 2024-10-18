package com.conan2zo.teamMission1008.controller;

import com.conan2zo.teamMission1008.model.service.JEMEmployeeService;

public class JEMEmployeeController {

    private final JEMEmployeeService jemEmployeeService;

    public JEMEmployeeController() {
        this.jemEmployeeService = new JEMEmployeeService();
    }

    public void selectAllMember() {
        jemEmployeeService.selectAllMember();

    }
}
