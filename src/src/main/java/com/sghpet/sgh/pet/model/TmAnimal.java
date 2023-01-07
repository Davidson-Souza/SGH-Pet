package com.sghpet.sgh.pet.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmAnimal extends AbstractTableModel {

    private final List<Animal> lista;

    private final int COL_NOME = 0;
    private final int COL_TYPE = 1;
    private final int COL_MEDICAL_CONDITION = 2;
    private final int COL_LAST_BATH = 3;

    public TmAnimal(List<Animal> lstCustomers) {
        lista = lstCustomers;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (lista.isEmpty()) {
            return "";
        } else {
            Animal aux = (Animal) lista.get(rowIndex);

            switch (columnIndex) {
                case COL_NOME -> {
                    return aux.getName();
                }
                case COL_TYPE -> {
                    return aux.getType();
                }
                case COL_MEDICAL_CONDITION -> {
                    return "n";
                }
                case COL_LAST_BATH -> {
                    return aux.getLastBathTime();
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
            case COL_MEDICAL_CONDITION -> {
                return "Condição médica?";
            }
            case COL_LAST_BATH -> {
                return "Ultimo banho";
            }
            case COL_TYPE -> {
                return "Tipo";
            }
            default -> {
                break;
            }
        }

        return "";
    }
}
