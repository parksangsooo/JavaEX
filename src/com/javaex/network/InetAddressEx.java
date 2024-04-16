package com.javaex.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {
    public static void main(String[] args) {
        // 내 PC 의 로컬 IP
        printLocalIP();
        // server IP 확인 (특정, NAVER, GOOGLE)
        printServerIP("www.naver.com");
        printServerIP("www.google.com");

    }

    private static void printLocalIP() {
        // local loop back : 127.0.0.1
        // PC : IP 설정 되어 있음. 공인 IP
        try {
            InetAddress local = InetAddress.getLocalHost();
            System.out.println("IP Address: " + local.getHostAddress());
        } catch (UnknownHostException e) {
            System.err.println("Host를 찾을 수 없어요.");
        }
    }

    private static void printServerIP(String hostName) {

        System.out.println(" -------------- ");

        try {
            InetAddress[] hosts = InetAddress.getAllByName(hostName);

            for (InetAddress remote : hosts) {
                System.out.println(hostName + " <Host IP Address: " + remote.getHostAddress() + ">");
            }

        } catch (UnknownHostException e) {
            System.err.println("Host를 찾을 수 없어요.");
        }

    }
}
