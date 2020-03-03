public class Tictactoe {
    int size;
    int[][] field;

    public Tictactoe(int size){
        // 0 - пусто, 1 - крестик, 2 - нолик
        this.field = new int[size][size];
        this.size = size;
    }

    void paintfield() {
        //рисует поле
        int i = 0;
        int j = 0;
        for(i = 0;i<size;i++){
            for(j = 0;j<size;j++){
                System.out.print(" " + field[i][j]);
            }
            System.out.println();
        }
    }

    boolean equals(int[][] field) {
        boolean result = true;
        int i,j;
        for(i = 0;i<this.size;i++){
            for(j = 0;j<this.size;j++){
                if(this.field[i][j]!=field[i][j])result = false;
            }
        }
        return result;
    }

    String tostring(){
        String result = "";
        int i,j;
        for(i = 0;i<this.size;i++){
            for(j = 0;j<this.size;j++){
                result+=this.field[i][j];
            }
        }
        return result;
    }

    void setcell(int row, int column, int content){
        this.field[row][column] = content;
    }

    void setcross(int row, int column){
        this.field[row][column] = 1;
    }

    void settoe(int row, int column){
        this.field[row][column] = 2;
    }

    void clearcell(int row, int column){
        this.field[row][column] = 0;
    }

    int getcell(int row, int column){
        return this.field[row][column];
    }

    int[][] getfield() {
        return this.field;
    }

    int sequencesearch(int content){
        int max = 0, i = 0 , j = 0;
        int lenght = 0;
        int dist1 = 0;
        int dist2 = 0;

        for ( i = 0; i < this.size; i++){
            for (j = 0; j < this.size; j++){
                if (this.field[i][j]==content){lenght++;}else{max = (lenght>max)?lenght:max;lenght=0;}
            }
            max = (lenght>max)?lenght:max;
            lenght=0;
        }
        for ( j = 0; j < this.size; j++){
            for (i = 0; i < this.size; i++){
                if (this.field[i][j]==content){lenght++;}else{max = (lenght>max)?lenght:max;lenght=0;}
            }
            max = (lenght>max)?lenght:max;
            lenght=0;
        }
        for(dist1 = 0; dist1 <= this.size*2-2; dist1++){
            dist2 = ((dist1 < this.size) ? dist1 : ((this.size * 2) - dist1-1));
            for(int i1 = ((dist1 < this.size) ? 0 : (dist1-this.size + 1)); i1 < ((dist1 < this.size) ? dist2+1 : this.size) ; i1++){
                int j1 = dist1-i1;
                if (this.field[i1][j1]==content){lenght++;}else{max = (lenght>max)?lenght:max;lenght=0;}
            }
            max = (lenght>max)?lenght:max;
            lenght=0;
        }
        for(dist1 = 0; dist1 <= this.size*2-2; dist1++){
            dist2 = ((dist1 < this.size) ? dist1 : ((this.size * 2) - dist1-1));
            for(int i1 = ((dist1 < this.size) ? 0 : (dist1 - this.size + 1) ); i1 < ((dist1 < this.size) ? dist2+1 : this.size ) ; i1++){
                int j1 = this.size - dist1 - 1 + i1;
                if (this.field[i1][j1]==content){lenght++;}else{max = (lenght>max)?lenght:max;lenght=0;}
            }
            max = (lenght>max)?lenght:max;
            lenght=0;
        }
    return max;
    }

    int crosssequencesearch(){
        return this.sequencesearch(1);
    }

    int toesequencesearch(){
        return this.sequencesearch(2);
    }
};

