package com.sghpet.sgh.pet.model;

import java.util.Arrays;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TmAnimal extends AbstractTableModel {

    private final List<Animal> list;
    
    private final int COL_SIZE = 5;

    private final int COL_NOME = 0;
    private final int COL_OWNER = 1;
    private final int COL_TYPE = 2;
    private final int COL_POSTAGE = 3;
    private final int COL_MEDICAL_CONDITION = 4;
    
    private final List<String> lstAnimalType = Arrays.asList("Cachorro","Gato","Pássaro","Peixe");
    private final List<String> lstAnimalPostage = Arrays.asList("Pequeno","Médio","Grande");
    
    public TmAnimal(List<Animal> lstAnimals) {
        this.list = lstAnimals;
    }

    @Override
    public int getRowCount() {
        return this.list.size();
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
            Animal aux = (Animal) list.get(rowIndex);

            switch (columnIndex) {
                case COL_NOME -> {
                    return aux.getName();
                }
                case COL_OWNER -> {
                    return aux.getOwner().getName();
                }
                case COL_TYPE -> {
                    return lstAnimalType.get(aux.getType());
                }
                case COL_POSTAGE -> {
                    return lstAnimalPostage.get(aux.getPostage());
                }
                case COL_MEDICAL_CONDITION -> {
                    return (aux.isHasMedicalCondition()) ? "Sim" : "Não";
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
                case COL_OWNER -> {
                    return "Dono";
                }
                case COL_TYPE -> {
                    return "Tipo";
                }
                case COL_POSTAGE -> {
                    return "Porte";
                }
                case COL_MEDICAL_CONDITION -> {
                    return "Condição médica?";
                }
                default -> {
                    break;
                }
        }
        return "";
    }
}
