package com.mukisasamuel.intellitechacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class Classes : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view:View = inflater!!.inflate(R.layout.fragment_classes, container, false)
         val  myWeb2 = view?.findViewById(R.id.webview3)as WebView
        myWeb2.apply {
            loadUrl("www.intellectitechacademy.com/classes")
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
        }
        return view
    }
}

