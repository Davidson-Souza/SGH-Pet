package com.sghpet.sgh.pet.model;

import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmReservation extends AbstractTableModel {

    private final List<Reservation> lista;

    private final int COL_SIZE = 6;
    
    private final int COL_ID = 0;
    private final int COL_OWNER_NOME = 1;
    private final int COL_TYPE = 2;
    private final int COL_ANIMAL_NAME = 3;
    private final int COL_START = 4;
    private final int COL_END = 5;
    
    private final List<String> lstReservationTypes = Arrays.asList("Padrão","Econômico","Luxo","Super Luxo");

    public TmReservation(List<Reservation> lstReservations) {
        lista = lstReservations;
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
            Reservation aux = (Reservation) lista.get(rowIndex);

            switch (columnIndex) {
                case COL_ID -> {
                    return aux.getId();
                }
                case COL_OWNER_NOME -> {
                    return aux.getCustomer().getName();
                }
                case COL_TYPE -> {
                    return lstReservationTypes.get(aux.getType());
                }
                case COL_ANIMAL_NAME -> {
                    return aux.getAnimal().getName();
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
            case COL_ID -> {
                return "ID";
            }
            case COL_OWNER_NOME -> {
                return "Dono";
            }
            case COL_TYPE -> {
                return "Tipo";
            }
            case COL_ANIMAL_NAME -> {
                return "Animal";
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
