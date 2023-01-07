package com.sghpet.sgh.pet.model;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmAccomodations extends AbstractTableModel {

    private final List<Accomodation> lista;

    private final int COL_ACCOMODATION_SIZE = 0;
    private final int COL_CAPACITY = 1;
    private final int COL_VACANT = 2;

    public TmAccomodations(List<Accomodation> lstCustomers) {
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
            Accomodation aux = (Accomodation) lista.get(rowIndex);

            switch (columnIndex) {
                case COL_ACCOMODATION_SIZE -> {
                    return aux.getAccomodationSize();
                }
                case COL_CAPACITY -> {
                    return aux.getCapacity();
                }
                case COL_VACANT -> {
                    return aux.getVacant();
                }
                default -> {
                }
            }
        }
        return "";
    }

    @Override
    public String getColumnName(int column
    ) {
        switch (column) {
            case COL_ACCOMODATION_SIZE -> {
                return "Tamanho";
            }
            case COL_CAPACITY -> {
                return "Capacidade";
            }
            case COL_VACANT -> {
                return "Ocioso";
            }
            default -> {
                break;
            }
        }

        return "";
    }
}
