package com.mukisasamuel.intellitechacademy.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.mukisasamuel.intellitechacademy.R


class HomeFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater!!.inflate(R.layout.fragment_home,container,false)
        val myWeb = view.findViewById(R.id.webview1)as WebView
        myWeb.apply{
            loadUrl("www.intellectitechacademy.com");
            webViewClient = WebViewClient();
            settings.javaScriptEnabled = true
        }
        return view
    }


}