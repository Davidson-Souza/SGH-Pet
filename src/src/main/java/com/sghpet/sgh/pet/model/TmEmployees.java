package com.sghpet.sgh.pet.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmEmployees extends AbstractTableModel {

    private List<Employee> list;
    private final int COL_NAME = 0;
    private final int COL_TYPE = 1;
    private final int COL_CPF = 2;
    private final int COL_ID = 3;

    public TmEmployees(List<Employee> employees) {
        this.list = employees;
    }

    @Override
    public int getRowCount() {
        return this.list.size();

    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int col) {
        var employee = this.list.get(row);
        switch (col) {
            case COL_NAME -> {
                return employee.getName();
            }
            case COL_CPF -> {
                return employee.getCpf();
            }
            case COL_TYPE -> {
                var job = employee.getJob();
                switch (job) {
                    case Admin -> {
                        return "Administrador";
                    }
                    case Clerk -> {
                        return "Atendente";
                    }
                    case Groundkeeper -> {
                        return "Zelador";
                    }
                    case Manager -> {
                        return "Gerente";
                    }
                    case Servicer -> {
                        return "Servisal";
                    }
                    default ->
                        throw new AssertionError();
                }
            }
            case COL_ID -> {
                return employee.getId();
            }
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case COL_NAME -> {
                return "Nome";
            }
            case COL_CPF -> {
                return "CPF";
            }
            case COL_TYPE -> {
                return "Trabalho";
            }
        }
        return "";
    }
}
