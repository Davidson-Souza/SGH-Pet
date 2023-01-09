package com.sghpet.sgh.pet.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmCustomers extends AbstractTableModel {

    private final List<Customer> lista;

    private final int COL_SIZE = 5;
    
    
    private final int COL_ID = 0;
    private final int COL_NOME = 1;
    private final int COL_CPF = 2;
    private final int COL_PHONE = 3;
    private final int COL_ADDRESS = 4;

    public TmCustomers(List<Customer> lstCustomers) {
        lista = lstCustomers;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return COL_SIZE;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (lista.isEmpty()) {
            return "";
        } else {
            Customer aux = (Customer) lista.get(rowIndex);

            switch (columnIndex) {
                case COL_ID -> {
                    return aux.getId();
                }
                case COL_NOME -> {
                    return aux.getName();
                }
                case COL_CPF -> {
                    return aux.getCpf();
                }
                case COL_PHONE -> {
                    return aux.getPhoneNumber();
                }
                case COL_ADDRESS -> {
                    return aux.getAddress();
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
            case COL_ID -> {
                return "ID";
            }
            case COL_NOME -> {
                return "Nome";
            }
            case COL_CPF -> {
                return "CPF";
            }
            case COL_PHONE -> {
                return "Número";
            }
            case COL_ADDRESS -> {
                return "Endereço";
            }
            default -> {
                break;
            }
        }

        return "";
    }
}
