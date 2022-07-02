package com.mukisasamuel.intellitechacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient


class ContactUs : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View =  inflater!!.inflate(R.layout.fragment_contact_us, container, false)
        val myWeb6 = view?.findViewById(R.id.webview6)as WebView
        myWeb6.apply {
            loadUrl("www.intellectitechacademy.com/contact-us");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view
    }

}