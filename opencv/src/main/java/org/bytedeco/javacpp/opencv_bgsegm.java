// Targeted by JavaCPP version 1.4.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_highgui.*;
import static org.bytedeco.javacpp.opencv_flann.*;
import static org.bytedeco.javacpp.opencv_ml.*;
import static org.bytedeco.javacpp.opencv_features2d.*;
import static org.bytedeco.javacpp.opencv_calib3d.*;
import static org.bytedeco.javacpp.opencv_video.*;

public class opencv_bgsegm extends org.bytedeco.javacpp.presets.opencv_bgsegm {
    static { Loader.load(); }

// Parsed from <opencv2/bgsegm.hpp>

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.


                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_BGSEGM_HPP__
// #define __OPENCV_BGSEGM_HPP__

// #include "opencv2/video.hpp"

// #ifdef __cplusplus

/** \defgroup bgsegm Improved Background-Foreground Segmentation Methods
*/

/** \addtogroup bgsegm
 *  \{
<p>
/** \brief Gaussian Mixture-based Background/Foreground Segmentation Algorithm.
<p>
The class implements the algorithm described in \cite KB2001 .
 */
@Namespace("cv::bgsegm") public static class BackgroundSubtractorMOG extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorMOG(Pointer p) { super(p); }

    public native int getHistory();
    public native void setHistory(int nframes);

    public native int getNMixtures();
    public native void setNMixtures(int nmix);

    public native double getBackgroundRatio();
    public native void setBackgroundRatio(double backgroundRatio);

    public native double getNoiseSigma();
    public native void setNoiseSigma(double noiseSigma);
}

/** \brief Creates mixture-of-gaussian background subtractor
<p>
@param history Length of the history.
@param nmixtures Number of Gaussian mixtures.
@param backgroundRatio Background ratio.
@param noiseSigma Noise strength (standard deviation of the brightness or each color channel). 0
means some automatic value.
 */
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorMOG createBackgroundSubtractorMOG(int history/*=200*/, int nmixtures/*=5*/,
                                  double backgroundRatio/*=0.7*/, double noiseSigma/*=0*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorMOG createBackgroundSubtractorMOG();


/** \brief Background Subtractor module based on the algorithm given in \cite Gold2012 .
 <p>
 Takes a series of images and returns a sequence of mask (8UC1)
 images of the same size, where 255 indicates Foreground and 0 represents Background.
 This class implements an algorithm described in "Visual Tracking of Human Visitors under
 Variable-Lighting Conditions for a Responsive Audio Art Installation," A. Godbehere,
 A. Matsukawa, K. Goldberg, American Control Conference, Montreal, June 2012.
 */
@Namespace("cv::bgsegm") public static class BackgroundSubtractorGMG extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorGMG(Pointer p) { super(p); }

    /** \brief Returns total number of distinct colors to maintain in histogram.
    */
    public native int getMaxFeatures();
    /** \brief Sets total number of distinct colors to maintain in histogram.
    */
    public native void setMaxFeatures(int maxFeatures);

    /** \brief Returns the learning rate of the algorithm.
    <p>
    It lies between 0.0 and 1.0. It determines how quickly features are "forgotten" from
    histograms.
     */
    public native double getDefaultLearningRate();
    /** \brief Sets the learning rate of the algorithm.
    */
    public native void setDefaultLearningRate(double lr);

    /** \brief Returns the number of frames used to initialize background model.
    */
    public native int getNumFrames();
    /** \brief Sets the number of frames used to initialize background model.
    */
    public native void setNumFrames(int nframes);

    /** \brief Returns the parameter used for quantization of color-space.
    <p>
    It is the number of discrete levels in each channel to be used in histograms.
     */
    public native int getQuantizationLevels();
    /** \brief Sets the parameter used for quantization of color-space
    */
    public native void setQuantizationLevels(int nlevels);

    /** \brief Returns the prior probability that each individual pixel is a background pixel.
    */
    public native double getBackgroundPrior();
    /** \brief Sets the prior probability that each individual pixel is a background pixel.
    */
    public native void setBackgroundPrior(double bgprior);

    /** \brief Returns the kernel radius used for morphological operations
    */
    public native int getSmoothingRadius();
    /** \brief Sets the kernel radius used for morphological operations
    */
    public native void setSmoothingRadius(int radius);

    /** \brief Returns the value of decision threshold.
    <p>
    Decision value is the value above which pixel is determined to be FG.
     */
    public native double getDecisionThreshold();
    /** \brief Sets the value of decision threshold.
    */
    public native void setDecisionThreshold(double thresh);

    /** \brief Returns the status of background model update
    */
    public native @Cast("bool") boolean getUpdateBackgroundModel();
    /** \brief Sets the status of background model update
    */
    public native void setUpdateBackgroundModel(@Cast("bool") boolean update);

    /** \brief Returns the minimum value taken on by pixels in image sequence. Usually 0.
    */
    public native double getMinVal();
    /** \brief Sets the minimum value taken on by pixels in image sequence.
    */
    public native void setMinVal(double val);

    /** \brief Returns the maximum value taken on by pixels in image sequence. e.g. 1.0 or 255.
    */
    public native double getMaxVal();
    /** \brief Sets the maximum value taken on by pixels in image sequence.
    */
    public native void setMaxVal(double val);
}

/** \brief Creates a GMG Background Subtractor
<p>
@param initializationFrames number of frames used to initialize the background models.
@param decisionThreshold Threshold value, above which it is marked foreground, else background.
 */
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorGMG createBackgroundSubtractorGMG(int initializationFrames/*=120*/,
                                                                        double decisionThreshold/*=0.8*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorGMG createBackgroundSubtractorGMG();

/** \brief Background subtraction based on counting.
  <p>
  About as fast as MOG2 on a high end system.
  More than twice faster than MOG2 on cheap hardware (benchmarked on Raspberry Pi3).
  <p>
  %Algorithm by Sagi Zeevi ( https://github.com/sagi-z/BackgroundSubtractorCNT )
*/
@Namespace("cv::bgsegm") public static class BackgroundSubtractorCNT extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorCNT(Pointer p) { super(p); }

    // BackgroundSubtractor interface
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask);
    public native void getBackgroundImage(@ByVal Mat backgroundImage);
    public native void getBackgroundImage(@ByVal UMat backgroundImage);
    public native void getBackgroundImage(@ByVal GpuMat backgroundImage);

    /** \brief Returns number of frames with same pixel color to consider stable.
    */
    public native int getMinPixelStability();
    /** \brief Sets the number of frames with same pixel color to consider stable.
    */
    public native void setMinPixelStability(int value);

    /** \brief Returns maximum allowed credit for a pixel in history.
    */
    public native int getMaxPixelStability();
    /** \brief Sets the maximum allowed credit for a pixel in history.
    */
    public native void setMaxPixelStability(int value);

    /** \brief Returns if we're giving a pixel credit for being stable for a long time.
    */
    public native @Cast("bool") boolean getUseHistory();
    /** \brief Sets if we're giving a pixel credit for being stable for a long time.
    */
    public native void setUseHistory(@Cast("bool") boolean value);

    /** \brief Returns if we're parallelizing the algorithm.
    */
    public native @Cast("bool") boolean getIsParallel();
    /** \brief Sets if we're parallelizing the algorithm.
    */
    public native void setIsParallel(@Cast("bool") boolean value);
}

/** \brief Creates a CNT Background Subtractor
<p>
@param minPixelStability number of frames with same pixel color to consider stable
@param useHistory determines if we're giving a pixel credit for being stable for a long time
@param maxPixelStability maximum allowed credit for a pixel in history
@param isParallel determines if we're parallelizing the algorithm
 */

@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorCNT createBackgroundSubtractorCNT(int minPixelStability/*=15*/,
                              @Cast("bool") boolean useHistory/*=true*/,
                              int maxPixelStability/*=15*60*/,
                              @Cast("bool") boolean isParallel/*=true*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorCNT createBackgroundSubtractorCNT();

/** enum cv::bgsegm::LSBPCameraMotionCompensation */
public static final int
    LSBP_CAMERA_MOTION_COMPENSATION_NONE = 0,
    LSBP_CAMERA_MOTION_COMPENSATION_LK = 1;

/** \brief Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
<p>
This algorithm demonstrates better performance on CDNET 2014 dataset compared to other algorithms in OpenCV.
 */
@Namespace("cv::bgsegm") public static class BackgroundSubtractorGSOC extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorGSOC(Pointer p) { super(p); }

    // BackgroundSubtractor interface
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask);

    public native void getBackgroundImage(@ByVal Mat backgroundImage);
    public native void getBackgroundImage(@ByVal UMat backgroundImage);
    public native void getBackgroundImage(@ByVal GpuMat backgroundImage);
}

/** \brief Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at \cite LGuo2016
 */
@Namespace("cv::bgsegm") public static class BackgroundSubtractorLSBP extends BackgroundSubtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorLSBP(Pointer p) { super(p); }

    // BackgroundSubtractor interface
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal Mat image, @ByVal Mat fgmask);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal UMat image, @ByVal UMat fgmask);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask, double learningRate/*=-1*/);
    public native void apply(@ByVal GpuMat image, @ByVal GpuMat fgmask);

    public native void getBackgroundImage(@ByVal Mat backgroundImage);
    public native void getBackgroundImage(@ByVal UMat backgroundImage);
    public native void getBackgroundImage(@ByVal GpuMat backgroundImage);
}

/** \brief This is for calculation of the LSBP descriptors.
 */
@Namespace("cv::bgsegm") public static class BackgroundSubtractorLSBPDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BackgroundSubtractorLSBPDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BackgroundSubtractorLSBPDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorLSBPDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BackgroundSubtractorLSBPDesc position(long position) {
        return (BackgroundSubtractorLSBPDesc)super.position(position);
    }

    public static native void calcLocalSVDValues(@ByVal Mat localSVDValues, @Const @ByRef Mat frame);
    public static native void calcLocalSVDValues(@ByVal UMat localSVDValues, @Const @ByRef Mat frame);
    public static native void calcLocalSVDValues(@ByVal GpuMat localSVDValues, @Const @ByRef Mat frame);

    public static native void computeFromLocalSVDValues(@ByVal Mat desc, @Const @ByRef Mat localSVDValues, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
    public static native void computeFromLocalSVDValues(@ByVal UMat desc, @Const @ByRef Mat localSVDValues, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
    public static native void computeFromLocalSVDValues(@ByVal GpuMat desc, @Const @ByRef Mat localSVDValues, @Cast("const cv::Point2i*") Point LSBPSamplePoints);

    public static native void compute(@ByVal Mat desc, @Const @ByRef Mat frame, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
    public static native void compute(@ByVal UMat desc, @Const @ByRef Mat frame, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
    public static native void compute(@ByVal GpuMat desc, @Const @ByRef Mat frame, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
}

/** \brief Creates an instance of BackgroundSubtractorGSOC algorithm.
<p>
Implementation of the different yet better algorithm which is called GSOC, as it was implemented during GSOC and was not originated from any paper.
<p>
@param mc Whether to use camera motion compensation.
@param nSamples Number of samples to maintain at each point of the frame.
@param replaceRate Probability of replacing the old sample - how fast the model will update itself.
@param propagationRate Probability of propagating to neighbors.
@param hitsThreshold How many positives the sample must get before it will be considered as a possible replacement.
@param alpha Scale coefficient for threshold.
@param beta Bias coefficient for threshold.
@param blinkingSupressionDecay Blinking supression decay factor.
@param blinkingSupressionMultiplier Blinking supression multiplier.
@param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
@param noiseRemovalThresholdFacFG Strength of the noise removal for foreground points.
 */
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorGSOC createBackgroundSubtractorGSOC(int mc/*=cv::bgsegm::LSBP_CAMERA_MOTION_COMPENSATION_NONE*/, int nSamples/*=20*/, float replaceRate/*=0.003f*/, float propagationRate/*=0.01f*/, int hitsThreshold/*=32*/, float alpha/*=0.01f*/, float beta/*=0.0022f*/, float blinkingSupressionDecay/*=0.1f*/, float blinkingSupressionMultiplier/*=0.1f*/, float noiseRemovalThresholdFacBG/*=0.0004f*/, float noiseRemovalThresholdFacFG/*=0.0008f*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorGSOC createBackgroundSubtractorGSOC();

/** \brief Creates an instance of BackgroundSubtractorLSBP algorithm.
<p>
Background Subtraction using Local SVD Binary Pattern. More details about the algorithm can be found at \cite LGuo2016
<p>
@param mc Whether to use camera motion compensation.
@param nSamples Number of samples to maintain at each point of the frame.
@param LSBPRadius LSBP descriptor radius.
@param Tlower Lower bound for T-values. See \cite LGuo2016 for details.
@param Tupper Upper bound for T-values. See \cite LGuo2016 for details.
@param Tinc Increase step for T-values. See \cite LGuo2016 for details.
@param Tdec Decrease step for T-values. See \cite LGuo2016 for details.
@param Rscale Scale coefficient for threshold values.
@param Rincdec Increase/Decrease step for threshold values.
@param noiseRemovalThresholdFacBG Strength of the noise removal for background points.
@param noiseRemovalThresholdFacFG Strength of the noise removal for foreground points.
@param LSBPthreshold Threshold for LSBP binary string.
@param minCount Minimal number of matches for sample to be considered as foreground.
 */
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorLSBP createBackgroundSubtractorLSBP(int mc/*=cv::bgsegm::LSBP_CAMERA_MOTION_COMPENSATION_NONE*/, int nSamples/*=20*/, int LSBPRadius/*=16*/, float Tlower/*=2.0f*/, float Tupper/*=32.0f*/, float Tinc/*=1.0f*/, float Tdec/*=0.05f*/, float Rscale/*=10.0f*/, float Rincdec/*=0.005f*/, float noiseRemovalThresholdFacBG/*=0.0004f*/, float noiseRemovalThresholdFacFG/*=0.0008f*/, int LSBPthreshold/*=8*/, int minCount/*=2*/);
@Namespace("cv::bgsegm") public static native @Ptr BackgroundSubtractorLSBP createBackgroundSubtractorLSBP();

/** \brief Synthetic frame sequence generator for testing background subtraction algorithms.
 <p>
 It will generate the moving object on top of the background.
 It will apply some distortion to the background to make the test more complex.
 */
@Namespace("cv::bgsegm") @NoOffset public static class SyntheticSequenceGenerator extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SyntheticSequenceGenerator(Pointer p) { super(p); }

    /** \brief Creates an instance of SyntheticSequenceGenerator.
    <p>
    @param background Background image for object.
    @param object Object image which will move slowly over the background.
    @param amplitude Amplitude of wave distortion applied to background.
    @param wavelength Length of waves in distortion applied to background.
    @param wavespeed How fast waves will move.
    @param objspeed How fast object will fly over background.
     */
    public SyntheticSequenceGenerator(@ByVal Mat background, @ByVal Mat object, double amplitude, double wavelength, double wavespeed, double objspeed) { super((Pointer)null); allocate(background, object, amplitude, wavelength, wavespeed, objspeed); }
    private native void allocate(@ByVal Mat background, @ByVal Mat object, double amplitude, double wavelength, double wavespeed, double objspeed);
    public SyntheticSequenceGenerator(@ByVal UMat background, @ByVal UMat object, double amplitude, double wavelength, double wavespeed, double objspeed) { super((Pointer)null); allocate(background, object, amplitude, wavelength, wavespeed, objspeed); }
    private native void allocate(@ByVal UMat background, @ByVal UMat object, double amplitude, double wavelength, double wavespeed, double objspeed);
    public SyntheticSequenceGenerator(@ByVal GpuMat background, @ByVal GpuMat object, double amplitude, double wavelength, double wavespeed, double objspeed) { super((Pointer)null); allocate(background, object, amplitude, wavelength, wavespeed, objspeed); }
    private native void allocate(@ByVal GpuMat background, @ByVal GpuMat object, double amplitude, double wavelength, double wavespeed, double objspeed);

    /** \brief Obtain the next frame in the sequence.
    <p>
    @param frame Output frame.
    @param gtMask Output ground-truth (reference) segmentation mask object/background.
     */
    public native void getNextFrame(@ByVal Mat frame, @ByVal Mat gtMask);
    public native void getNextFrame(@ByVal UMat frame, @ByVal UMat gtMask);
    public native void getNextFrame(@ByVal GpuMat frame, @ByVal GpuMat gtMask);
}

/** \brief Creates an instance of SyntheticSequenceGenerator.
<p>
@param background Background image for object.
@param object Object image which will move slowly over the background.
@param amplitude Amplitude of wave distortion applied to background.
@param wavelength Length of waves in distortion applied to background.
@param wavespeed How fast waves will move.
@param objspeed How fast object will fly over background.
 */
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal Mat background, @ByVal Mat object, double amplitude/*=2.0*/, double wavelength/*=20.0*/, double wavespeed/*=0.2*/, double objspeed/*=6.0*/);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal Mat background, @ByVal Mat object);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal UMat background, @ByVal UMat object, double amplitude/*=2.0*/, double wavelength/*=20.0*/, double wavespeed/*=0.2*/, double objspeed/*=6.0*/);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal UMat background, @ByVal UMat object);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal GpuMat background, @ByVal GpuMat object, double amplitude/*=2.0*/, double wavelength/*=20.0*/, double wavespeed/*=0.2*/, double objspeed/*=6.0*/);
@Namespace("cv::bgsegm") public static native @Ptr SyntheticSequenceGenerator createSyntheticSequenceGenerator(@ByVal GpuMat background, @ByVal GpuMat object);

/** \} */




// #endif
// #endif


}
