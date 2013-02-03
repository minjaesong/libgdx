/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btDefaultSoftBodySolver extends btSoftBodySolver {
  private long swigCPtr;

  protected btDefaultSoftBodySolver(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btDefaultSoftBodySolver_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btDefaultSoftBodySolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btDefaultSoftBodySolver(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btDefaultSoftBodySolver() {
    this(gdxBulletJNI.new_btDefaultSoftBodySolver(), true);
  }

  public void optimize(SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t softBodies, boolean forceUpdate) {
    gdxBulletJNI.btDefaultSoftBodySolver_optimize__SWIG_0(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t.getCPtr(softBodies), forceUpdate);
  }

  public void optimize(SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t softBodies) {
    gdxBulletJNI.btDefaultSoftBodySolver_optimize__SWIG_1(swigCPtr, this, SWIGTYPE_p_btAlignedObjectArrayT_btSoftBody_p_t.getCPtr(softBodies));
  }

  public void copyBackToSoftBodies(boolean bMove) {
    gdxBulletJNI.btDefaultSoftBodySolver_copyBackToSoftBodies__SWIG_0(swigCPtr, this, bMove);
  }

  public void copyBackToSoftBodies() {
    gdxBulletJNI.btDefaultSoftBodySolver_copyBackToSoftBodies__SWIG_1(swigCPtr, this);
  }

  public void copySoftBodyToVertexBuffer(btSoftBody softBody, btVertexBufferDescriptor vertexBuffer) {
    gdxBulletJNI.btDefaultSoftBodySolver_copySoftBodyToVertexBuffer(swigCPtr, this, btSoftBody.getCPtr(softBody), softBody, btVertexBufferDescriptor.getCPtr(vertexBuffer), vertexBuffer);
  }

  public void processCollision(btSoftBody arg0, btCollisionObjectWrapper arg1) {
    gdxBulletJNI.btDefaultSoftBodySolver_processCollision__SWIG_0(swigCPtr, this, btSoftBody.getCPtr(arg0), arg0, btCollisionObjectWrapper.getCPtr(arg1), arg1);
  }

  public void processCollision(btSoftBody arg0, btSoftBody arg1) {
    gdxBulletJNI.btDefaultSoftBodySolver_processCollision__SWIG_1(swigCPtr, this, btSoftBody.getCPtr(arg0), arg0, btSoftBody.getCPtr(arg1), arg1);
  }

}
