package co.edu.unipiloto.beeradviser;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;


public class FindBeerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view){
        BeerExpert beerExpert = new BeerExpert();
        TextView brands = (TextView) findViewById(R.id.brands);
        Spinner color= (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        List<String> brandsList = beerExpert.getBrands(beerType);
        StringBuilder brandsFormatted = new StringBuilder();

        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');

        }
        brands.setText(brandsFormatted);

    }
}