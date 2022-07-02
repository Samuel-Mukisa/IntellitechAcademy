package com.mukisasamuel.intellitechacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class Instructors : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view :View = inflater.inflate(R.layout.fragment_instructors, container, false)
        val myWeb5 = view?.findViewById(R.id.webview5)as WebView
        myWeb5.apply {
            loadUrl("www.intellectitechacademy.com/instructors");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view
    }

}