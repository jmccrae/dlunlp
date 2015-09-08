package edu.insight.unlp.nn;

import java.util.Map;

public interface NNLayer {

	public int numNeuronUnits();

	public Map<Integer, double[]> lastActivations();
	
	public double[] activations();
	
	//public double[] avgActivations();
	
	public double[] errorGradient(double[] input);

	public void update(double learningRate);
	
	public double[] computeActivations(double[] input);
	
	public double[] output(double[] input);
	
	public void initializeLayer(int previousLayerUnits);
	
	public void resetActivationCounter();
	
	public int getActivationCounterVal();
	
}