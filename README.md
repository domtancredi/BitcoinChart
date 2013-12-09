BitcoinChart (1.0)
============

BitcoinChart for Google Glass is a straight-forward app to get the current price of Bitcoin in USD from the Coinbase API.

Say *chart bitcoin* and it will show the latest price of Bitcoin, in the *USD* currency, from the Coinbase API

Introduction
------------

Bitcoin Chart is an application that runs a background task process to retrieve the price of bitcoin from the Coinbase API. It then display that price, the currency (currently set to *USD*), and the timestamp in a Card. 

Installation
------------

To build and install BitcoinChart, you will need the [Android SDK
tools](http://developer.android.com/sdk/index.html) and the [Glass Development
Kit](http://developers.google.com/glass/develop/gdk/index). Follow the steps here to install the [SDK Platform and GDK Sneak Peak](https://developers.google.com/glass/develop/gdk/quick-start)

If you are getting an unknown error on com.google.* check that the Project->Properties
are set to use the "Glass Development Kit".

Connect your Glass via USB. Make sure your Glass shows up in the DDMS. Open Eclipse/ADT and build the project to your Glass.

Usage
-----

BitcoinChart uses GDK voice triggers. Supported commands are:

* `chart bitcoin`

Thanks
------

I want to also thank the community for their support and help:

* Glass Community
* StackOverflow
* https://github.com/cmenscher
* https://github.com/mr-sk