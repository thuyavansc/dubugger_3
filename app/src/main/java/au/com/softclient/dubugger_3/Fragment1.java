package au.com.softclient.dubugger_3;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {

    private int counter = 0;
    private TextView counterTextView;
    private EditText editText;
    private TextView displayTextView;

    public Fragment1() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1, container, false);

        counterTextView = view.findViewById(R.id.counterTextView);
        editText = view.findViewById(R.id.editText);
        displayTextView = view.findViewById(R.id.displayTextView);

        Button incrementButton = view.findViewById(R.id.incrementButton);
        incrementButton.setOnClickListener(v -> incrementCounter());

        Button decrementButton = view.findViewById(R.id.decrementButton);
        decrementButton.setOnClickListener(v -> decrementCounter());

        Button submitButton = view.findViewById(R.id.submitButton);
        submitButton.setOnClickListener(v -> updateText());

        Button nextButton = view.findViewById(R.id.nextButton);
        nextButton.setOnClickListener(v -> goToNextFragment());

        return view;
    }

    private void incrementCounter() {
        counter++;
        counterTextView.setText("Counter: " + counter);
    }

    private void decrementCounter() {
        counter--;
        counterTextView.setText("Counter: " + counter);
    }

    private void updateText() {
        String text = editText.getText().toString();
        displayTextView.setText(text);
    }

    private void goToNextFragment() {
        ((MainActivity) getActivity()).navigateToFragment2();
    }
}