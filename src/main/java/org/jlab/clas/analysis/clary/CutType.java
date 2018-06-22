package org.jlab.clas.analysis.clary;

import com.google.gson.*;

import java.io.*;
import java.util.*;

import org.jlab.clas.analysis.clary.ECCutParameters;//CutDetectors;
import org.jlab.clas.analysis.clary.BetaCutParameters;//CutDetectors;

public class CutType{

    int cutlvl;
    Map<String, ECCutParameters> cut_ecdetectors;
    Map<String, BetaCutParameters> cut_betadetectors;
    
    public CutType(){
	
    }
   
    public void setCutLevel( int temp_cutlvl ){
	cutlvl = temp_cutlvl;       
    }

    public int getCutLevel(){
	return cutlvl;
    }

    public void setECParameterMap(){
	cut_ecdetectors = new HashMap<String,ECCutParameters>();
    }

    //new
    public void setBetaParameterMap(){
	cut_betadetectors = new HashMap<String,BetaCutParameters>();
    }

    public Map<String, ECCutParameters> getECCutParameters() { //CutDetectors> getCutDetectors(){
	return cut_ecdetectors;
    }
    
    //new
    public Map<String, BetaCutParameters> getBetaCutParameters() { //CutDetectors> getCutDetectors(){
	return cut_betadetectors;
    }

    public void addECCutParameters(String temp_name){
 	cut_ecdetectors.put(temp_name, new ECCutParameters() );
    }

    //new
    public void addBetaCutParameters(String temp_name){
 	cut_betadetectors.put(temp_name, new BetaCutParameters() );
    }

    public ECCutParameters getECCutParametersClass( String temp_name ){
	return cut_ecdetectors.get(temp_name);
    }

    //new
    public BetaCutParameters getBetaCutParametersClass( String temp_name ){
	return cut_betadetectors.get(temp_name);
    }

}