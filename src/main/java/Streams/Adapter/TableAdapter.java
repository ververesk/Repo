package Streams.Adapter;

public class TableAdapter {
    public static void main(String[] args) {
        ATable aTable = new ATable() {
            @Override
            public String getCurrentUserName() {
                return "Amigo";
            }

            @Override
            public String getTableName() {
                return "DashboardTable";
            }
        };
        BTable bTable=new TableAdapt(aTable);
        System.out.println(bTable.getHeaderText());
    }
    public static class TableAdapt implements BTable{
        private ATable aTable;

        public TableAdapt(ATable aTable) {
            this.aTable=aTable;
        }

        @Override
        public String getHeaderText() {

            return String.format("[%s] : %s",this.aTable.getCurrentUserName(), this.aTable.getTableName());
        }
    }
    public interface ATable {
        String getCurrentUserName();
        String getTableName();
    }
    public interface BTable {
        String getHeaderText();
    }
}
