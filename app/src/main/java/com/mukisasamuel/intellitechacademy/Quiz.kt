package com.mukisasamuel.intellitechacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class Quiz : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View = inflater!!.inflate(R.layout.fragment_quiz, container, false)
        val myWeb4 = view?.findViewById(R.id.webview4) as WebView

        myWeb4.apply {
            loadUrl("www.intellectitechacademy.com/quizzes");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view
    }

}