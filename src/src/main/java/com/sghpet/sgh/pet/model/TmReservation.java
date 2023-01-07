package com.sghpet.sgh.pet.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmReservation extends AbstractTableModel {

    private final List<Reservation> lista;

    private final int COL_OWNER_NOME = 0;
    private final int COL_TYPE = 1;
    private final int COL_ANIMAL_NAME = 2;
    private final int COL_START = 3;
    private final int COL_END = 4;

    public TmReservation(List<Reservation> lstReservations) {
        lista = lstReservations;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (lista.isEmpty()) {
            return "";
        } else {
            Reservation aux = (Reservation) lista.get(rowIndex);

            switch (columnIndex) {
                case COL_OWNER_NOME -> {
                    return aux.getCustomer().getName();
                }
                case COL_ANIMAL_NAME -> {
                    return aux.getAnimal().getName();
                }
                case COL_TYPE -> {
                    return aux.getAnimal().getType();
                }
                case COL_START -> {
                    return aux.getStartDate();
                }
                case COL_END -> {
                    return aux.getEndDate();
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
            case COL_OWNER_NOME -> {
                return "Dono";
            }
            case COL_ANIMAL_NAME -> {
                return "PET";
            }
            case COL_TYPE -> {
                return "Tipo";
            }
            case COL_START -> {
                return "Início";
            }
            case COL_END -> {
                return "Fim";
            }
            default -> {
                break;
            }
        }

        return "";
    }
}
