package frc.team2879.adis16448toastdemo;

import com.analog.adis16448.frc.ADIS16448_IMU;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import jaci.openrio.toast.lib.log.Logger;
import jaci.openrio.toast.lib.module.IterativeModule;
import jaci.openrio.toast.lib.state.RobotState;

public class RobotModule extends IterativeModule {

    public static Logger logger;

    public static ADIS16448_IMU imu;
    
    @Override
    public String getModuleName() {
        return "ADIS16448ToastDemo";
    }

    @Override
    public String getModuleVersion() {
        return "0.0.2";
    }

    @Override
    public void robotInit() {
        logger = new Logger("ADIS16448ToastDemo", Logger.ATTR_DEFAULT);
        imu = new ADIS16448_IMU();
    }
    
    @Override
    public void tickState(RobotState state) {
        SmartDashboard.putData("IMU", imu);
    }
}
