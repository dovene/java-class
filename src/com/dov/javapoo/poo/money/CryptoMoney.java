package com.dov.javapoo.poo.money;

class CryptoMoney extends Money {
    private String blockChainName;

    public CryptoMoney(String name, float exchangeRate, String blockChainName) {
        super(name, exchangeRate);
        this.blockChainName = blockChainName;
    }

    public String getBlockChainName() {
        return blockChainName;
    }

    @Override
    public String getInformations() {
        return super.getInformations() + ", blockChain : " + blockChainName;
    }
}
