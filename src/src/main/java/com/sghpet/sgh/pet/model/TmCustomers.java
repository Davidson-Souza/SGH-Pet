package com.sghpet.sgh.pet.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmCustomers extends AbstractTableModel {

    private final List<Customer> lista;

    private final int COL_NOME = 0;
    private final int COL_CPF = 1;

    public TmCustomers(List<Customer> lstCustomers) {
        lista = lstCustomers;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (lista.isEmpty()) {
            return "";
        } else {
            Customer aux = (Customer) lista.get(rowIndex);

            switch (columnIndex) {
                case COL_NOME -> {
                    return aux.getName();
                }
                case COL_CPF -> {
                    return aux.getCpf();
                }
                default -> {
                }
            }
        }
        return "";
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case COL_NOME -> {
                return "Nome";
            }
            case COL_CPF -> {
                return "CPF";
            }
            default -> {
                break;
            }
        }

        return "";
    }
}
