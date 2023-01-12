
package com.sghpet.sgh.pet.model;

import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmPayment extends AbstractTableModel{
    private final List<Payment> list;

    private final int COL_SIZE = 6;
    
    private final int COL_ID = 0;
    private final int COL_RESERVE = 1;
    private final int COL_PRICE = 2;
    private final int COL_METHOD = 3;
    private final int COL_PARTS = 4;
    private final int COL_PAYDATE = 5;
    
    private final List<String> lstMethodTypes = Arrays.asList("Pix","Cash","Boleto");

    public TmPayment(List<Payment> lstPayments) {
        list = lstPayments;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return COL_SIZE;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (list.isEmpty()) {
            return "";
        } else {
            Payment aux = (Payment) list.get(rowIndex);

            switch (columnIndex) {
                case COL_ID -> {
                    return aux.getId();
                }
                case COL_RESERVE -> {
                    return aux.getReservation().getId();
                }
                case COL_PRICE -> {
                    return aux.getPrice();
                }
                case COL_METHOD -> {
                    return aux.getMethod().toString();
                }
                case COL_PARTS -> {
                    return aux.getParts();
                }
                case COL_PAYDATE -> {
                    return aux.getPaymentDate().toString();
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
            case COL_RESERVE -> {
                return "Reserva";
            }
            case COL_PRICE -> {
                return "Preço";
            }
            case COL_METHOD -> {
                return "Método";
            }
            case COL_PARTS -> {
                return "Parcelas";
            }
            case COL_PAYDATE -> {
                return "Pag. Data";
            }
            default -> {
                break;
            }
        }

        return "";
    }
}
