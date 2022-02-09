package com.company;

public class Buildings {
    public static void placeHouse(){ //2
        // find tile clicked
        // Tiles myTile = tileClicked;
        if (myTile.getType() == 0 && myTile.isLight()){
            myTile.setType(2);
        }
        else{
            System.out.println("obstruction to building");
        }
    }
    public static void placeLight(){ //5
        // find tile clicked
        // Tiles myTile = tileClicked;
        if (myTile.getType() == 0 && myTile.isLight()){
            myTile.setType(5);
        }
        else{
            System.out.println("obstruction to building");
        }
    }

    public static void placeGenerator(){ //3
        // find tile clicked
        // Tiles myTile = tileClicked;
        int xCoord = myTile.getX();
        int yCoord = myTile.getY();
        Tiles myTile1 = GameBoard.searchGrid(xCoord+1,yCoord);
        if (myTile.getType() == 0 && myTile1.getType() == 0 && myTile.isLight() && myTile1.isLight()){
            myTile.setType(3);
            myTile1.setType(3);
        }
        else{
            System.out.println("obstruction to building");
        }
    }
    public static void placeMine(){ //6
        // find tile clicked
        // Tiles myTile = tileClicked;
        int xCoord = myTile.getX();
        int yCoord = myTile.getY();
        Tiles myTile1 = GameBoard.searchGrid(xCoord+1,yCoord);
        Tiles myTile2 = GameBoard.searchGrid(xCoord,yCoord+1);
        Tiles myTile3 = GameBoard.searchGrid(xCoord+1,yCoord+1);
        if (myTile.getType() == 0 && myTile1.getType() == 0 && myTile2.getType() == 0 && myTile3.getType() == 0 && myTile.isLight() && myTile1.isLight() && myTile2.isLight() && myTile3.isLight()){
            myTile.setType(6);
            myTile1.setType(6);
            myTile2.setType(6);
            myTile3.setType(6);
        }
        else{
            System.out.println("obstruction to building");
        }
    }
    public static void placeFarm(){ //4
        // find tile clicked
        // Tiles myTile = tileClicked;
        int xCoord = myTile.getX();
        int yCoord = myTile.getY();
        Tiles myTile1 = GameBoard.searchGrid(xCoord+1,yCoord);
        Tiles myTile2 = GameBoard.searchGrid(xCoord,yCoord+1);
        Tiles myTile3 = GameBoard.searchGrid(xCoord+1,yCoord+1);
        Tiles myTile4 = GameBoard.searchGrid(xCoord-1,yCoord);
        Tiles myTile5 = GameBoard.searchGrid(xCoord,yCoord-1);
        Tiles myTile6 = GameBoard.searchGrid(xCoord-1,yCoord-1);
        Tiles myTile7 = GameBoard.searchGrid(xCoord+1,yCoord-1);
        Tiles myTile8 = GameBoard.searchGrid(xCoord-1,yCoord+1);
        if (myTile.getType() == 0 && myTile1.getType() == 0 && myTile2.getType() == 0 && myTile3.getType() == 0 && myTile4.getType() == 0 && myTile5.getType() == 0 && myTile6.getType() == 0 && myTile7.getType() == 0 && myTile8.getType() == 0 && myTile.isLight() && myTile1.isLight() && myTile2.isLight() && myTile3.isLight() && myTile4.isLight() && myTile5.isLight()&& myTile6.isLight() && myTile7.isLight() && myTile8.isLight()){
            myTile.setType(4);
            myTile1.setType(4);
            myTile2.setType(4);
            myTile3.setType(4);
            myTile4.setType(4);
            myTile5.setType(4);
            myTile6.setType(4);
            myTile7.setType(4);
            myTile8.setType(4);
        }
        else{
            System.out.println("obstruction to building");
        }
    }
}
