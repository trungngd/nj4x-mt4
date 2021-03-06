/*
 * Copyright (c) 2008-2014 by Gerasimenko Roman.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistribution of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistribution in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in
 *     the documentation and/or other materials provided with the
 *     distribution.
 *
 * 3. The name "JFX" must not be used to endorse or promote
 *     products derived from this software without prior written
 *     permission.
 *     For written permission, please contact roman.gerasimenko@gmail.com
 *
 * 4. Products derived from this software may not be called "JFX",
 *     nor may "JFX" appear in their name, without prior written
 *     permission of Gerasimenko Roman.
 *
 *  THIS SOFTWARE IS PROVIDED "AS IS" AND ANY EXPRESSED OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 *  DISCLAIMED.  IN NO EVENT SHALL THE JFX CONTRIBUTORS
 *  BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 *  SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 *  LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 *  USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 *  ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 *  OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 *  OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 *  SUCH DAMAGE.
 */

package com.jfx;

/**
 * Default brokers set
 */
public class Broker {
    public int getType() {
        return this.val != null && this.val.startsWith("5*") ? 5 : 4;
    }

    /**
     * 
     */
    public final static Broker AlpariNZ_Demo = new Broker("Alpari-Demo");
    /**
     * 
     */
    public final static Broker AlpariUK_Demo = new Broker("AlpariUK-Demo");
    /**
     * 
     */
    public final static Broker AlpariUK_Live = new Broker("AlpariUK-Live");
    /**
     * 
     */
    public final static Broker AlpariUS_Demo = new Broker("AlpariUS-Demo");
    /**
     * 
     */
    public final static Broker AlpariUS_Live = new Broker("AlpariUS-Live");
    /**
     * 
     */
    public final static Broker Apex_Real = new Broker("Apex-Real");
    /**
     * 
     */
    public final static Broker ATCBrokers_Demo_Pro_EST = new Broker("ATCBrokers-Demo-Pro-EST");
    /**
     * 
     */
    public final static Broker CrownForexSA_Server = new Broker("CrownForexSA-Server");
    /**
     * 
     */
    public final static Broker EuroForex_Server = new Broker("EuroForex-Server");
    /**
     * 
     */
    public final static Broker EuroOrient_Demo = new Broker("EuroOrient-Demo");
    /**
     * 
     */
    public final static Broker EuroOrient_Real1 = new Broker("EuroOrient-Real1");
    /**
     * 
     */
    public final static Broker EuroOrient_Real2 = new Broker("EuroOrient-Real2");
    /**
     * 
     */
    public final static Broker FIBO_Demo = new Broker("FIBO-Demo");
    /**
     * 
     */
    public final static Broker FinMarket_Server = new Broker("FinMarket-Server");
    /**
     * 
     */
    public final static Broker Forex_Server = new Broker("Forex-Server");
    /**
     * 
     */
    public final static Broker Forex_com_Demo = new Broker("Forex.com-Demo");
    /**
     * 
     */
    public final static Broker Forex_com_Live = new Broker("Forex.com-Live");
    /**
     * 
     */
    public final static Broker Forex_com_Server = new Broker("Forex.com-Server");
    /**
     * 
     */
    public final static Broker ForexBest_Demo = new Broker("ForexBest-Demo");
    /**
     * 
     */
    public final static Broker ForexBest_Real = new Broker("ForexBest-Real");
    /**
     * 
     */
    public final static Broker FXDD_MT4_DEMO_Server = new Broker("FXDD-MT4 DEMO Server");
    /**
     * 
     */
    public final static Broker FXDD_MT4_Live_Server = new Broker("FXDD-MT4 Live Server");
    /**
     * 
     */
    public final static Broker FXDirectDealer_MT4_DEMO_Server = new Broker("FXDirectDealer-MT4 DEMO Server");
    /**
     * 
     */
    public final static Broker FXDirectDealer_MT4_Live_Server = new Broker("FXDirectDealer-MT4 Live Server");
    /**
     * 
     */
    public final static Broker FxPro_Server = new Broker("FxPro-Server");
    /**
     * 
     */
    public final static Broker Gimex_NEXTT = new Broker("Gimex-NEXTT");
    /**
     * 
     */
    public final static Broker IntegralBank_Server = new Broker("IntegralBank-Server");
    /**
     * 
     */
    public final static Broker InterbankFX_Demo_Accounts = new Broker("InterbankFX-Demo Accounts");
    /**
     * 
     */
    public final static Broker InterbankFX_Live_Accounts = new Broker("InterbankFX-Live Accounts");
    /**
     * 
     */
    public final static Broker MBTrading_Demo = new Broker("MBTrading-Demo Server");
    /**
     * 
     */
    public final static Broker MBTrading_Live = new Broker("MBTrading-Live Server");
    /**
     * 
     */
    public final static Broker InterbankFX_MT4_Demo_Accounts_2 = new Broker("InterbankFX-MT4 Demo Accounts 2");
    /**
     * 
     */
    public final static Broker InterbankFX_MT4_Mini_Accounts_2 = new Broker("InterbankFX-MT4 Mini Accounts 2");
    /**
     * 
     */
    public final static Broker InterbankFX_MT4_Mini_Accounts_3 = new Broker("InterbankFX-MT4 Mini Accounts 3");
    /**
     * 
     */
    public final static Broker InterbankFX_MT4_Mini_Accounts_4 = new Broker("InterbankFX-MT4 Mini Accounts 4");
    /**
     * 
     */
    public final static Broker InterbankFX_MT4_Mini_Accounts = new Broker("InterbankFX-MT4 Mini Accounts");
    /**
     * 
     */
    public final static Broker InterbankFX_MT4_MM_Mini = new Broker("InterbankFX-MT4 MM Mini");
    /**
     * 
     */
    public final static Broker InterbankFX_MT4_Standard_Accounts_2 = new Broker("InterbankFX-MT4 Standard Accounts 2");
    /**
     * 
     */
    public final static Broker InterbankFX_MT4_Standard_Accounts = new Broker("InterbankFX-MT4 Standard Accounts");
    /**
     * 
     */
    public final static Broker MIG_Real = new Broker("MIG-Real");
    /**
     * 
     */
    public final static Broker MIG_Real2 = new Broker("MIG-Real2");
    /**
     * 
     */
    public final static Broker NorthFinance_Demo = new Broker("NorthFinance-Demo");
    /**
     * 
     */
    public final static Broker ODL_MT4_Demo = new Broker("ODL-MT4 Demo");
    /**
     * 
     */
    public final static Broker Omnivest_Omnivest_Trading_System = new Broker("Omnivest-Omnivest Trading System");
    /**
     * 
     */
    public final static Broker Orion_DEMO = new Broker("Orion-DEMO");
    /**
     * 
     */
    public final static Broker RCG_Demo = new Broker("RCG-Demo");
    /**
     * 
     */
    public final static Broker RCG_Pro = new Broker("RCG-Pro");
    /**
     * 
     */
    public final static Broker RCG_Server1 = new Broker("RCG-Server1");
    /**
     * 
     */
    public final static Broker RealTrade_Demo = new Broker("RealTrade-Demo");
    /**
     * 
     */
    public final static Broker RealTrade_Real = new Broker("RealTrade-Real");
    /**
     * 
     */
    public final static Broker RFXT_Server = new Broker("RFXT-Server");
    /**
     * 
     */
    public final static Broker SIG_Lite_com = new Broker("SIG-Lite.com");
    /**
     * 
     */
    public final static Broker SpotTrader_Real = new Broker("SpotTrader-Real");
    /**
     * 
     */
    public final static Broker TeleTrade_Demo = new Broker("TeleTrade-Demo");
    /**
     * 
     */
    public final static Broker TeleTrade_Server = new Broker("TeleTrade-Server");
    /**
     * 
     */
    public final static Broker UGMFX_Live = new Broker("UGMFX-Live");
    /**
     * 
     */
    public final static Broker Ukrsotsbank_MT4 = new Broker("Ukrsotsbank-MT4");
    /**
     * 
     */
    public final static Broker XTB_Demo = new Broker("XTB-Demo");
    /**
     * 
     */
    public final static Broker XTB_Real = new Broker("XTB-Real");
    private String val;
    private String proxyServer;
    private ProxyType proxyType;
    private String proxyLogin;
    private String proxyPassword;

    public Broker(String val) {
        this.val = val;
    }

    public String getVal() {
        if (val.indexOf('@') < 0 && proxyServer != null) {
            return this.val + "@" + proxyServer
                    + "\u0001" + proxyType
                    + "\u0001" + (proxyLogin == null ? "" : proxyLogin)
                    + "\u0001" + (proxyPassword == null ? "" : proxyPassword)
                    + "\u0001"
            ;
        }
        return val;
    }

    public enum ProxyType {
        HTTP, SOCKS4, SOCKS5
    }

    public Broker(Broker b, String proxyServer, ProxyType proxyType, String proxyLogin, String proxyPassword) {
        this(b.val, proxyServer, proxyType, proxyLogin, proxyPassword);
    }

    public Broker(String val, String proxyServer, ProxyType proxyType) {
        this(val, proxyServer, proxyType, null, null);
    }

    public Broker(String val, String proxyServer, ProxyType proxyType, String proxyLogin, String proxyPassword) {
        this.val = val;
        this.proxyServer = proxyServer;
        this.proxyType = proxyType;
        this.proxyLogin = proxyLogin;
        this.proxyPassword = proxyPassword;
/*
        if (val.indexOf('@') < 0 && proxyServer != null) {
            this.val += "@" + proxyServer
                    + "\u0001" + proxyType
                    + "\u0001" + (proxyLogin == null ? "" : proxyLogin)
                    + "\u0001" + (proxyPassword == null ? "" : proxyPassword)
                    + "\u0001"
            ;
        }
*/
    }

    @Override
    public String toString() {
        return getVal();
    }

    public String getSrv() {
        return val;
    }

    public ProxyType getProxyType() {
        return proxyType;
    }

    public String getProxyServer() {
        return proxyServer;
    }

    public String getProxyLogin() {
        return proxyLogin;
    }

    public String getProxyPassword() {
        return proxyPassword;
    }
}
