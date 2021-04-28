package model

class Camera {
    private var isOn: Boolean = false
    private var resolution: Int = 640

    fun setResolution(resolution: Int){
        this.resolution = resolution
    }

    fun getResolution(): Int{
        return this.resolution
    }

    fun turnOn(){
        this.isOn = true
    }

    fun turnOff(){
        this.isOn = false
    }

    fun getCameraStatus(): String{
        return if (this.isOn) {
            "Camera is Turned"
        } else {
            "Camera isn't Turned"
        }
    }

    fun setCameraStatus(onOff: Boolean){
        this.isOn = onOff
    }
}