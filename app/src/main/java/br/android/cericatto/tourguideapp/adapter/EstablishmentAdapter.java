package br.android.cericatto.tourguideapp.adapter;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.android.cericatto.tourguideapp.R;
import br.android.cericatto.tourguideapp.model.Establishment;

/**
 * EstablishmentAdapter.java.
 *
 * @author Rodrigo Cericatto
 * @since Sep 29, 2016
 */
public class EstablishmentAdapter extends RecyclerView.Adapter<EstablishmentAdapter.ViewHolder> {

    //--------------------------------------------------
    // Attributes
    //--------------------------------------------------

    private Activity mActivity;
    private List<Establishment> mItems;

    //--------------------------------------------------
    // Constructor
    //--------------------------------------------------

    public EstablishmentAdapter(Activity context, List<Establishment> items) {
        mActivity = context;
        mItems = items;
    }

    //--------------------------------------------------
    // Adapter Methods
    //--------------------------------------------------

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_establishment, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        Establishment item = mItems.get(position);

        Drawable drawable = ContextCompat.getDrawable(mActivity, item.getImageId());
        holder.establishmentImageView.setImageDrawable(drawable);
        holder.nameTextView.setText(item.getNameId());

        holder.neighborhoodTextView.setText(item.getNeighborhoodId());
        holder.descriptionTextView.setText(item.getDescriptionId());
    }

    @Override
    public int getItemCount() {
        if (mItems != null && mItems.size() > 0) {
            return mItems.size();
        }
        return 0;
    }

    //--------------------------------------------------
    // View Holder
    //--------------------------------------------------

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView establishmentImageView;
        public TextView nameTextView;

        public TextView neighborhoodTextView;
        public TextView descriptionTextView;

        public ViewHolder(View view) {
            super(view);
            establishmentImageView = (ImageView)view.findViewById(R.id.id_adapter_establishment__image_view);
            nameTextView = (TextView)view.findViewById(R.id.id_adapter_establishment__name_text_view);

            neighborhoodTextView = (TextView)view.findViewById(R.id.id_adapter_establishment__neighborhood_text_view);
            descriptionTextView = (TextView)view.findViewById(R.id.id_adapter_establishment__description_text_view);
        }
    }
}