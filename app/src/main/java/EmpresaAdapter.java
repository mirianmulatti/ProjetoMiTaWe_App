import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.aluno.projetoandroid.Empresa;
import com.example.aluno.projetoandroid.R;

import java.util.ArrayList;

/**
 * Created by aluno on 12/11/19.
 */

public class EmpresaAdapter extends ArrayAdapter<Empresa> {

    private final Context context;
    private final ArrayList<Empresa> elementos;


    public EmpresaAdapter(Context context, ArrayList<Empresa> elementos) {
        super(context, R.layout.activity_lista, elementos);
        this.context = context;
        this.elementos = elementos;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView= inflater.inflate(R.layout.activity_lista, parent, false);
        TextView nome = (TextView) rowView.findViewById(R.id.editTextNome2);
        TextView endereco = (TextView) rowView.findViewById(R.id.editTextLoca);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imagem);
        nome.setText(elementos.get(position).getNome());
        endereco.setText(elementos.get(position).getLocalizacao());

        return rowView;
    }

}
