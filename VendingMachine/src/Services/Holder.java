package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.Place;

public class Holder {
    private List<Place> placesList;
    private int rows;
    private int cols;

    public List<Place> getPlacesList() {
        return placesList;
    }

    public Holder(int xSize, int ySize) {
        this.rows = xSize;
        this.cols = ySize;
        placesList = new ArrayList<>(xSize * ySize);
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                placesList.add(new Place(x, y));
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}