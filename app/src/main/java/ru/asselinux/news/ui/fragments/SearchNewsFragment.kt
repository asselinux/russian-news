package ru.asselinux.news.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.asselinux.news.R
import ru.asselinux.news.ui.MainActivity
import ru.asselinux.news.ui.NewsViewModel

class SearchNewsFragment : Fragment(R.layout.fragment_search_news) {

    lateinit var viewModel : NewsViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (activity as MainActivity).viewModel
    }
}