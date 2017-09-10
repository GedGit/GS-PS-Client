/* RsModel - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public class OffScreenModel extends Renderable {
	boolean field_az_1448 = false;
	byte[] field_u_1449;
	int verticeCount = 0;
	int[] vertexY;
	short[] field_v_1452;
	int[] triangleA;
	int[] triangleB;
	int[] vertexX;
	byte[] texMapX;
	int[] vertexZ;
	short[] field_o_1458;
	static int[] field_aj_1459 = Rasterizer3D.COSINE;
	short[] triangleColors;
	short[] texMapZ;
	byte field_x_1462 = 0;
	static int[] field_ah_1463 = new int[10000];
	short[] field_i_1464;
	short[] field_s_1465;
	static int field_ay_1466 = 0;
	int triangleCount = 0;
	short[] field_p_1468;
	byte[] field_l_1469;
	int texturedTriangleCount;
	short[] field_t_1471;
	byte[] field_j_1472;
	int field_aw_1473;
	byte[] field_ad_1474;
	int[] vertex_skin;
	int[] field_ae_1476;
	int[][] field_ax_1477;
	int[][] field_al_1478;
	Class_cj[] field_ar_1479;
	Vector3[] normals;
	Vector3[] isolatedNormals;
	public short field_ao_1482;
	public short field_ac_1483;
	short[] field_c_1484;
	int field_at_1485;
	int field_aa_1486;
	int field_an_1487;
	byte[] texMapY;
	int field_ai_1489;
	int[] triangleC;
	static int[] field_aq_1491 = new int[10000];
	short[] field_w_1492;
	static int[] field_am_1493 = Rasterizer3D.SINE;
	short[] field_b_1494;

	public static OffScreenModel getModel(final FileStore class_fs, final int i, final int i_0_) {
		final byte[] is = class_fs.getArchive(i, i_0_);
		return is == null ? null : new OffScreenModel(is);
	}

	OffScreenModel(final byte[] is) {
		if ((is[is.length - 1] == -1) && (is[is.length - 2] == -1)) {
			method_z_void(is);
		} else {
			method_y_void(is);
		}
	}

	void method_z_void(final byte[] is) {
		final Buffer rsbytebuffer = new Buffer(is);
		final Buffer rsbytebuffer_1_ = new Buffer(is);
		final Buffer rsbytebuffer_2_ = new Buffer(is);
		final Buffer rsbytebuffer_3_ = new Buffer(is);
		final Buffer rsbytebuffer_4_ = new Buffer(is);
		final Buffer rsbytebuffer_5_ = new Buffer(is);
		final Buffer rsbytebuffer_6_ = new Buffer(is);
		rsbytebuffer.position = (is.length - 23) * -685856689;
		final int i = rsbytebuffer.getShort();
		final int i_7_ = rsbytebuffer.getShort();
		final int i_8_ = rsbytebuffer.get();
		final int i_9_ = rsbytebuffer.get();
		final int i_10_ = rsbytebuffer.get();
		final int i_11_ = rsbytebuffer.get();
		final int i_12_ = rsbytebuffer.get();
		final int i_13_ = rsbytebuffer.get();
		final int i_14_ = rsbytebuffer.get();
		final int i_15_ = rsbytebuffer.getShort();
		final int i_16_ = rsbytebuffer.getShort();
		final int i_17_ = rsbytebuffer.getShort();
		final int i_18_ = rsbytebuffer.getShort();
		final int i_19_ = rsbytebuffer.getShort();
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		if (i_8_ > 0) {
			this.field_j_1472 = new byte[i_8_];
			rsbytebuffer.position = 0;
			for (int i_23_ = 0; i_23_ < i_8_; i_23_++) {
				final byte i_24_ = (this.field_j_1472[i_23_] = rsbytebuffer.getSigned());
				if (i_24_ == 0) {
					i_20_++;
				}
				if ((i_24_ >= 1) && (i_24_ <= 3)) {
					i_21_++;
				}
				if (i_24_ == 2) {
					i_22_++;
				}
			}
		}
		int i_25_ = i_8_ + i;
		final int i_26_ = i_25_;
		if (i_9_ == 1) {
			i_25_ += i_7_;
		}
		final int i_27_ = i_25_;
		i_25_ += i_7_;
		final int i_28_ = i_25_;
		if (i_10_ == 255) {
			i_25_ += i_7_;
		}
		final int i_29_ = i_25_;
		if (i_12_ == 1) {
			i_25_ += i_7_;
		}
		final int i_30_ = i_25_;
		if (i_14_ == 1) {
			i_25_ += i;
		}
		final int i_31_ = i_25_;
		if (i_11_ == 1) {
			i_25_ += i_7_;
		}
		final int i_32_ = i_25_;
		i_25_ += i_18_;
		final int i_33_ = i_25_;
		if (i_13_ == 1) {
			i_25_ += i_7_ * 2;
		}
		final int i_34_ = i_25_;
		i_25_ += i_19_;
		final int i_35_ = i_25_;
		i_25_ += i_7_ * 2;
		final int i_36_ = i_25_;
		i_25_ += i_15_;
		final int i_37_ = i_25_;
		i_25_ += i_16_;
		final int i_38_ = i_25_;
		i_25_ += i_17_;
		final int i_39_ = i_25_;
		i_25_ += i_20_ * 6;
		final int i_40_ = i_25_;
		i_25_ += i_21_ * 6;
		final int i_41_ = i_25_;
		i_25_ += i_21_ * 6;
		final int i_42_ = i_25_;
		i_25_ += i_21_ * 2;
		final int i_43_ = i_25_;
		i_25_ += i_21_;
		final int i_44_ = i_25_;
		i_25_ += (i_21_ * 2) + (i_22_ * 2);
		this.verticeCount = i;
		this.triangleCount = i_7_;
		this.texturedTriangleCount = i_8_;
		this.vertexX = new int[i];
		this.vertexZ = new int[i];
		this.vertexY = new int[i];
		this.triangleA = new int[i_7_];
		this.triangleB = new int[i_7_];
		this.triangleC = new int[i_7_];
		if (i_14_ == 1) {
			this.vertex_skin = new int[i];
		}
		if (i_9_ == 1) {
			this.texMapX = new byte[i_7_];
		}
		if (i_10_ == 255) {
			this.texMapY = new byte[i_7_];
		} else {
			this.field_x_1462 = (byte) i_10_;
		}
		if (i_11_ == 1) {
			this.field_l_1469 = new byte[i_7_];
		}
		if (i_12_ == 1) {
			this.field_ae_1476 = new int[i_7_];
		}
		if (i_13_ == 1) {
			this.texMapZ = new short[i_7_];
		}
		if ((i_13_ == 1) && (i_8_ > 0)) {
			this.field_u_1449 = new byte[i_7_];
		}
		this.triangleColors = new short[i_7_];
		if (i_8_ > 0) {
			this.field_s_1465 = new short[i_8_];
			this.field_v_1452 = new short[i_8_];
			this.field_c_1484 = new short[i_8_];
			if (i_21_ > 0) {
				this.field_p_1468 = new short[i_21_];
				this.field_o_1458 = new short[i_21_];
				this.field_b_1494 = new short[i_21_];
				this.field_t_1471 = new short[i_21_];
				this.field_ad_1474 = new byte[i_21_];
				this.field_w_1492 = new short[i_21_];
			}
			if (i_22_ > 0) {
				this.field_i_1464 = new short[i_22_];
			}
		}
		rsbytebuffer.position = i_8_ * -685856689;
		rsbytebuffer_1_.position = i_36_ * -685856689;
		rsbytebuffer_2_.position = i_37_ * -685856689;
		rsbytebuffer_3_.position = i_38_ * -685856689;
		rsbytebuffer_4_.position = i_30_ * -685856689;
		int i_45_ = 0;
		int i_46_ = 0;
		int i_47_ = 0;
		for (int i_48_ = 0; i_48_ < i; i_48_++) {
			final int i_49_ = rsbytebuffer.get();
			int i_50_ = 0;
			if ((i_49_ & 0x1) != 0) {
				i_50_ = rsbytebuffer_1_.method_al_int((byte) -17);
			}
			int i_51_ = 0;
			if ((i_49_ & 0x2) != 0) {
				i_51_ = rsbytebuffer_2_.method_al_int((byte) -102);
			}
			int i_52_ = 0;
			if ((i_49_ & 0x4) != 0) {
				i_52_ = rsbytebuffer_3_.method_al_int((byte) -23);
			}
			this.vertexX[i_48_] = i_45_ + i_50_;
			this.vertexZ[i_48_] = i_46_ + i_51_;
			this.vertexY[i_48_] = i_47_ + i_52_;
			i_45_ = this.vertexX[i_48_];
			i_46_ = this.vertexZ[i_48_];
			i_47_ = this.vertexY[i_48_];
			if (i_14_ == 1) {
				this.vertex_skin[i_48_] = rsbytebuffer_4_.get();
			}
		}
		rsbytebuffer.position = i_35_ * -685856689;
		rsbytebuffer_1_.position = i_26_ * -685856689;
		rsbytebuffer_2_.position = i_28_ * -685856689;
		rsbytebuffer_3_.position = i_31_ * -685856689;
		rsbytebuffer_4_.position = i_29_ * -685856689;
		rsbytebuffer_5_.position = i_33_ * -685856689;
		rsbytebuffer_6_.position = i_34_ * -685856689;
		for (int i_53_ = 0; i_53_ < i_7_; i_53_++) {
			this.triangleColors[i_53_] = (short) rsbytebuffer.getShort();
			if (i_9_ == 1) {
				this.texMapX[i_53_] = rsbytebuffer_1_.getSigned();
			}
			if (i_10_ == 255) {
				this.texMapY[i_53_] = rsbytebuffer_2_.getSigned();
			}
			if (i_11_ == 1) {
				this.field_l_1469[i_53_] = rsbytebuffer_3_.getSigned();
			}
			if (i_12_ == 1) {
				this.field_ae_1476[i_53_] = rsbytebuffer_4_.get();
			}
			if (i_13_ == 1) {
				this.texMapZ[i_53_] = (short) (rsbytebuffer_5_.getShort() - 1);
			}
			if ((this.field_u_1449 != null) && (this.texMapZ[i_53_] != -1)) {
				this.field_u_1449[i_53_] = (byte) (rsbytebuffer_6_.get() - 1);
			}
		}
		rsbytebuffer.position = i_32_ * -685856689;
		rsbytebuffer_1_.position = i_27_ * -685856689;
		int i_54_ = 0;
		int i_55_ = 0;
		int i_56_ = 0;
		int i_57_ = 0;
		for (int i_58_ = 0; i_58_ < i_7_; i_58_++) {
			final int i_59_ = rsbytebuffer_1_.get();
			if (i_59_ == 1) {
				i_54_ = rsbytebuffer.method_al_int((byte) -5) + i_57_;
				i_55_ = rsbytebuffer.method_al_int((byte) -77) + i_54_;
				i_56_ = rsbytebuffer.method_al_int((byte) -82) + i_55_;
				i_57_ = i_56_;
				this.triangleA[i_58_] = i_54_;
				this.triangleB[i_58_] = i_55_;
				this.triangleC[i_58_] = i_56_;
			}
			if (i_59_ == 2) {
				i_55_ = i_56_;
				i_56_ = rsbytebuffer.method_al_int((byte) -85) + i_57_;
				i_57_ = i_56_;
				this.triangleA[i_58_] = i_54_;
				this.triangleB[i_58_] = i_55_;
				this.triangleC[i_58_] = i_56_;
			}
			if (i_59_ == 3) {
				i_54_ = i_56_;
				i_56_ = rsbytebuffer.method_al_int((byte) -25) + i_57_;
				i_57_ = i_56_;
				this.triangleA[i_58_] = i_54_;
				this.triangleB[i_58_] = i_55_;
				this.triangleC[i_58_] = i_56_;
			}
			if (i_59_ == 4) {
				final int i_60_ = i_54_;
				i_54_ = i_55_;
				i_55_ = i_60_;
				i_56_ = rsbytebuffer.method_al_int((byte) -60) + i_57_;
				i_57_ = i_56_;
				this.triangleA[i_58_] = i_54_;
				this.triangleB[i_58_] = i_60_;
				this.triangleC[i_58_] = i_56_;
			}
		}
		rsbytebuffer.position = i_39_ * -685856689;
		rsbytebuffer_1_.position = i_40_ * -685856689;
		rsbytebuffer_2_.position = i_41_ * -685856689;
		rsbytebuffer_3_.position = i_42_ * -685856689;
		rsbytebuffer_4_.position = i_43_ * -685856689;
		rsbytebuffer_5_.position = i_44_ * -685856689;
		for (int i_61_ = 0; i_61_ < i_8_; i_61_++) {
			final int i_62_ = this.field_j_1472[i_61_] & 0xff;
			if (i_62_ == 0) {
				this.field_s_1465[i_61_] = (short) rsbytebuffer.getShort();
				this.field_v_1452[i_61_] = (short) rsbytebuffer.getShort();
				this.field_c_1484[i_61_] = (short) rsbytebuffer.getShort();
			}
			if (i_62_ == 1) {
				this.field_s_1465[i_61_] = (short) rsbytebuffer_1_.getShort();
				this.field_v_1452[i_61_] = (short) rsbytebuffer_1_.getShort();
				this.field_c_1484[i_61_] = (short) rsbytebuffer_1_.getShort();
				this.field_p_1468[i_61_] = (short) rsbytebuffer_2_.getShort();
				this.field_o_1458[i_61_] = (short) rsbytebuffer_2_.getShort();
				this.field_b_1494[i_61_] = (short) rsbytebuffer_2_.getShort();
				this.field_t_1471[i_61_] = (short) rsbytebuffer_3_.getShort();
				this.field_ad_1474[i_61_] = rsbytebuffer_4_.getSigned();
				this.field_w_1492[i_61_] = (short) rsbytebuffer_5_.getShort();
			}
			if (i_62_ == 2) {
				this.field_s_1465[i_61_] = (short) rsbytebuffer_1_.getShort();
				this.field_v_1452[i_61_] = (short) rsbytebuffer_1_.getShort();
				this.field_c_1484[i_61_] = (short) rsbytebuffer_1_.getShort();
				this.field_p_1468[i_61_] = (short) rsbytebuffer_2_.getShort();
				this.field_o_1458[i_61_] = (short) rsbytebuffer_2_.getShort();
				this.field_b_1494[i_61_] = (short) rsbytebuffer_2_.getShort();
				this.field_t_1471[i_61_] = (short) rsbytebuffer_3_.getShort();
				this.field_ad_1474[i_61_] = rsbytebuffer_4_.getSigned();
				this.field_w_1492[i_61_] = (short) rsbytebuffer_5_.getShort();
				this.field_i_1464[i_61_] = (short) rsbytebuffer_5_.getShort();
			}
			if (i_62_ == 3) {
				this.field_s_1465[i_61_] = (short) rsbytebuffer_1_.getShort();
				this.field_v_1452[i_61_] = (short) rsbytebuffer_1_.getShort();
				this.field_c_1484[i_61_] = (short) rsbytebuffer_1_.getShort();
				this.field_p_1468[i_61_] = (short) rsbytebuffer_2_.getShort();
				this.field_o_1458[i_61_] = (short) rsbytebuffer_2_.getShort();
				this.field_b_1494[i_61_] = (short) rsbytebuffer_2_.getShort();
				this.field_t_1471[i_61_] = (short) rsbytebuffer_3_.getShort();
				this.field_ad_1474[i_61_] = rsbytebuffer_4_.getSigned();
				this.field_w_1492[i_61_] = (short) rsbytebuffer_5_.getShort();
			}
		}
		rsbytebuffer.position = i_25_ * -685856689;
		final int i_63_ = rsbytebuffer.get();
		if (i_63_ != 0) {
			new Class_cw();
			rsbytebuffer.getShort();
			rsbytebuffer.getShort();
			rsbytebuffer.getShort();
			rsbytebuffer.getInt();
		}
	}

	public OffScreenModel(final OffScreenModel[] rsmodels, final int i) {
		boolean bool = false;
		boolean bool_64_ = false;
		boolean bool_65_ = false;
		boolean bool_66_ = false;
		boolean bool_67_ = false;
		boolean bool_68_ = false;
		this.verticeCount = 0;
		this.triangleCount = 0;
		this.texturedTriangleCount = 0;
		this.field_x_1462 = (byte) -1;
		for (int i_69_ = 0; i_69_ < i; i_69_++) {
			final OffScreenModel rsmodel_70_ = rsmodels[i_69_];
			if (rsmodel_70_ != null) {
				this.verticeCount += rsmodel_70_.verticeCount;
				this.triangleCount += rsmodel_70_.triangleCount;
				this.texturedTriangleCount += rsmodel_70_.texturedTriangleCount;
				if (rsmodel_70_.texMapY != null) {
					bool_64_ = true;
				} else {
					if (this.field_x_1462 == -1) {
						this.field_x_1462 = rsmodel_70_.field_x_1462;
					}
					if (this.field_x_1462 != rsmodel_70_.field_x_1462) {
						bool_64_ = true;
					}
				}
				bool = bool | (rsmodel_70_.texMapX != null);
				bool_65_ = bool_65_ | (rsmodel_70_.field_l_1469 != null);
				bool_66_ = bool_66_ | (rsmodel_70_.field_ae_1476 != null);
				bool_67_ = bool_67_ | (rsmodel_70_.texMapZ != null);
				bool_68_ = bool_68_ | (rsmodel_70_.field_u_1449 != null);
			}
		}
		this.vertexX = new int[this.verticeCount];
		this.vertexZ = new int[this.verticeCount];
		this.vertexY = new int[this.verticeCount];
		this.vertex_skin = new int[this.verticeCount];
		this.triangleA = new int[this.triangleCount];
		this.triangleB = new int[this.triangleCount];
		this.triangleC = new int[this.triangleCount];
		if (bool) {
			this.texMapX = new byte[this.triangleCount];
		}
		if (bool_64_) {
			this.texMapY = new byte[this.triangleCount];
		}
		if (bool_65_) {
			this.field_l_1469 = new byte[this.triangleCount];
		}
		if (bool_66_) {
			this.field_ae_1476 = new int[this.triangleCount];
		}
		if (bool_67_) {
			this.texMapZ = new short[this.triangleCount];
		}
		if (bool_68_) {
			this.field_u_1449 = new byte[this.triangleCount];
		}
		this.triangleColors = new short[this.triangleCount];
		if (this.texturedTriangleCount > 0) {
			this.field_j_1472 = new byte[this.texturedTriangleCount];
			this.field_s_1465 = new short[this.texturedTriangleCount];
			this.field_v_1452 = new short[this.texturedTriangleCount];
			this.field_c_1484 = new short[this.texturedTriangleCount];
			this.field_p_1468 = new short[this.texturedTriangleCount];
			this.field_o_1458 = new short[this.texturedTriangleCount];
			this.field_b_1494 = new short[this.texturedTriangleCount];
			this.field_t_1471 = new short[this.texturedTriangleCount];
			this.field_ad_1474 = new byte[this.texturedTriangleCount];
			this.field_w_1492 = new short[this.texturedTriangleCount];
			this.field_i_1464 = new short[this.texturedTriangleCount];
		}
		this.verticeCount = 0;
		this.triangleCount = 0;
		this.texturedTriangleCount = 0;
		for (int i_71_ = 0; i_71_ < i; i_71_++) {
			final OffScreenModel rsmodel_72_ = rsmodels[i_71_];
			if (rsmodel_72_ != null) {
				for (int i_73_ = 0; i_73_ < rsmodel_72_.triangleCount; i_73_++) {
					if (bool && (rsmodel_72_.texMapX != null)) {
						this.texMapX[(this.triangleCount)] = rsmodel_72_.texMapX[i_73_];
					}
					if (bool_64_) {
						if (rsmodel_72_.texMapY != null) {
							this.texMapY[(this.triangleCount)] = rsmodel_72_.texMapY[i_73_];
						} else {
							this.texMapY[(this.triangleCount)] = rsmodel_72_.field_x_1462;
						}
					}
					if (bool_65_ && (rsmodel_72_.field_l_1469 != null)) {
						this.field_l_1469[(this.triangleCount)] = rsmodel_72_.field_l_1469[i_73_];
					}
					if (bool_66_ && (rsmodel_72_.field_ae_1476 != null)) {
						this.field_ae_1476[(this.triangleCount)] = rsmodel_72_.field_ae_1476[i_73_];
					}
					if (bool_67_) {
						if (rsmodel_72_.texMapZ != null) {
							this.texMapZ[(this.triangleCount)] = rsmodel_72_.texMapZ[i_73_];
						} else {
							this.texMapZ[(this.triangleCount)] = (short) -1;
						}
					}
					if (bool_68_) {
						if ((rsmodel_72_.field_u_1449 != null) && (rsmodel_72_.field_u_1449[i_73_] != -1)) {
							this.field_u_1449[(this.triangleCount)] = (byte) ((rsmodel_72_.field_u_1449[i_73_]) + (this.texturedTriangleCount));
						} else {
							this.field_u_1449[(this.triangleCount)] = (byte) -1;
						}
					}
					this.triangleColors[(this.triangleCount)] = rsmodel_72_.triangleColors[i_73_];
					this.triangleA[this.triangleCount] = method_e_int(rsmodel_72_, (rsmodel_72_.triangleA[i_73_]));
					this.triangleB[this.triangleCount] = method_e_int(rsmodel_72_, (rsmodel_72_.triangleB[i_73_]));
					this.triangleC[this.triangleCount] = method_e_int(rsmodel_72_, (rsmodel_72_.triangleC[i_73_]));
					this.triangleCount++;
				}
				for (int i_74_ = 0; i_74_ < rsmodel_72_.texturedTriangleCount; i_74_++) {
					final byte i_75_ = (this.field_j_1472[this.texturedTriangleCount] = rsmodel_72_.field_j_1472[i_74_]);
					if (i_75_ == 0) {
						this.field_s_1465[(this.texturedTriangleCount)] = (short) method_e_int(rsmodel_72_, (rsmodel_72_.field_s_1465[i_74_]));
						this.field_v_1452[(this.texturedTriangleCount)] = (short) method_e_int(rsmodel_72_, (rsmodel_72_.field_v_1452[i_74_]));
						this.field_c_1484[(this.texturedTriangleCount)] = (short) method_e_int(rsmodel_72_, (rsmodel_72_.field_c_1484[i_74_]));
					}
					if ((i_75_ >= 1) && (i_75_ <= 3)) {
						this.field_s_1465[(this.texturedTriangleCount)] = rsmodel_72_.field_s_1465[i_74_];
						this.field_v_1452[(this.texturedTriangleCount)] = rsmodel_72_.field_v_1452[i_74_];
						this.field_c_1484[(this.texturedTriangleCount)] = rsmodel_72_.field_c_1484[i_74_];
						this.field_p_1468[(this.texturedTriangleCount)] = rsmodel_72_.field_p_1468[i_74_];
						this.field_o_1458[(this.texturedTriangleCount)] = rsmodel_72_.field_o_1458[i_74_];
						this.field_b_1494[(this.texturedTriangleCount)] = rsmodel_72_.field_b_1494[i_74_];
						this.field_t_1471[(this.texturedTriangleCount)] = rsmodel_72_.field_t_1471[i_74_];
						this.field_ad_1474[this.texturedTriangleCount] = rsmodel_72_.field_ad_1474[i_74_];
						this.field_w_1492[(this.texturedTriangleCount)] = rsmodel_72_.field_w_1492[i_74_];
					}
					if (i_75_ == 2) {
						this.field_i_1464[(this.texturedTriangleCount)] = rsmodel_72_.field_i_1464[i_74_];
					}
					this.texturedTriangleCount++;
				}
			}
		}
	}

	public void method_k_void(final int i) {
		final int i_76_ = field_am_1493[i];
		final int i_77_ = field_aj_1459[i];
		for (int i_78_ = 0; i_78_ < this.verticeCount; i_78_++) {
			final int i_79_ = (((this.vertexY[i_78_] * i_76_) + (this.vertexX[i_78_] * i_77_)) >> 16);
			this.vertexY[i_78_] = ((this.vertexY[i_78_] * i_77_) - (this.vertexX[i_78_] * i_76_)) >> 16;
				this.vertexX[i_78_] = i_79_;
		}
		method_p_void();
	}

	public OffScreenModel(final OffScreenModel rsmodel_80_, final boolean bool, final boolean bool_81_, final boolean bool_82_, final boolean bool_83_) {
		this.verticeCount = rsmodel_80_.verticeCount;
		this.triangleCount = rsmodel_80_.triangleCount;
		this.texturedTriangleCount = rsmodel_80_.texturedTriangleCount;
		if (bool) {
			this.vertexX = rsmodel_80_.vertexX;
			this.vertexZ = rsmodel_80_.vertexZ;
			this.vertexY = rsmodel_80_.vertexY;
		} else {
			this.vertexX = new int[this.verticeCount];
			this.vertexZ = new int[this.verticeCount];
			this.vertexY = new int[this.verticeCount];
			for (int i = 0; i < this.verticeCount; i++) {
				this.vertexX[i] = rsmodel_80_.vertexX[i];
				this.vertexZ[i] = rsmodel_80_.vertexZ[i];
				this.vertexY[i] = rsmodel_80_.vertexY[i];
			}
		}
		if (bool_81_) {
			this.triangleColors = rsmodel_80_.triangleColors;
		} else {
			this.triangleColors = new short[this.triangleCount];
			for (int i = 0; i < this.triangleCount; i++) {
				this.triangleColors[i] = rsmodel_80_.triangleColors[i];
			}
		}
		if (!bool_82_ && (rsmodel_80_.texMapZ != null)) {
			this.texMapZ = new short[this.triangleCount];
			for (int i = 0; i < this.triangleCount; i++) {
				this.texMapZ[i] = rsmodel_80_.texMapZ[i];
			}
		} else {
			this.texMapZ = rsmodel_80_.texMapZ;
		}
		if (bool_83_) {
			this.field_l_1469 = rsmodel_80_.field_l_1469;
		} else {
			this.field_l_1469 = new byte[this.triangleCount];
			if (rsmodel_80_.field_l_1469 == null) {
				for (int i = 0; i < this.triangleCount; i++) {
					this.field_l_1469[i] = (byte) 0;
				}
			} else {
				for (int i = 0; i < this.triangleCount; i++) {
					this.field_l_1469[i] = rsmodel_80_.field_l_1469[i];
				}
			}
		}
		this.triangleA = rsmodel_80_.triangleA;
		this.triangleB = rsmodel_80_.triangleB;
		this.triangleC = rsmodel_80_.triangleC;
		this.texMapX = rsmodel_80_.texMapX;
		this.texMapY = rsmodel_80_.texMapY;
		this.field_u_1449 = rsmodel_80_.field_u_1449;
		this.field_x_1462 = rsmodel_80_.field_x_1462;
		this.field_j_1472 = rsmodel_80_.field_j_1472;
		this.field_s_1465 = rsmodel_80_.field_s_1465;
		this.field_v_1452 = rsmodel_80_.field_v_1452;
		this.field_c_1484 = rsmodel_80_.field_c_1484;
		this.field_p_1468 = rsmodel_80_.field_p_1468;
		this.field_o_1458 = rsmodel_80_.field_o_1458;
		this.field_b_1494 = rsmodel_80_.field_b_1494;
		this.field_t_1471 = rsmodel_80_.field_t_1471;
		this.field_ad_1474 = rsmodel_80_.field_ad_1474;
		this.field_w_1492 = rsmodel_80_.field_w_1492;
		this.field_i_1464 = rsmodel_80_.field_i_1464;
		this.vertex_skin = rsmodel_80_.vertex_skin;
		this.field_ae_1476 = rsmodel_80_.field_ae_1476;
		this.field_ax_1477 = rsmodel_80_.field_ax_1477;
		this.field_al_1478 = rsmodel_80_.field_al_1478;
		this.normals = rsmodel_80_.normals;
		this.field_ar_1479 = rsmodel_80_.field_ar_1479;
		this.isolatedNormals = rsmodel_80_.isolatedNormals;
		field_ao_1482 = rsmodel_80_.field_ao_1482;
		field_ac_1483 = rsmodel_80_.field_ac_1483;
	}

	public OffScreenModel method_m_cy() {
		final OffScreenModel rsmodel_84_ = new OffScreenModel();
		if (this.texMapX != null) {
			rsmodel_84_.texMapX = new byte[this.triangleCount];
			for (int i = 0; i < this.triangleCount; i++) {
				rsmodel_84_.texMapX[i] = this.texMapX[i];
			}
		}
		rsmodel_84_.verticeCount = this.verticeCount;
		rsmodel_84_.triangleCount = this.triangleCount;
		rsmodel_84_.texturedTriangleCount = this.texturedTriangleCount;
		rsmodel_84_.vertexX = this.vertexX;
		rsmodel_84_.vertexZ = this.vertexZ;
		rsmodel_84_.vertexY = this.vertexY;
		rsmodel_84_.triangleA = this.triangleA;
		rsmodel_84_.triangleB = this.triangleB;
		rsmodel_84_.triangleC = this.triangleC;
		rsmodel_84_.texMapY = this.texMapY;
		rsmodel_84_.field_l_1469 = this.field_l_1469;
		rsmodel_84_.field_u_1449 = this.field_u_1449;
		rsmodel_84_.triangleColors = this.triangleColors;
		rsmodel_84_.texMapZ = this.texMapZ;
		rsmodel_84_.field_x_1462 = this.field_x_1462;
		rsmodel_84_.field_j_1472 = this.field_j_1472;
		rsmodel_84_.field_s_1465 = this.field_s_1465;
		rsmodel_84_.field_v_1452 = this.field_v_1452;
		rsmodel_84_.field_c_1484 = this.field_c_1484;
		rsmodel_84_.field_p_1468 = this.field_p_1468;
		rsmodel_84_.field_o_1458 = this.field_o_1458;
		rsmodel_84_.field_b_1494 = this.field_b_1494;
		rsmodel_84_.field_t_1471 = this.field_t_1471;
		rsmodel_84_.field_ad_1474 = this.field_ad_1474;
		rsmodel_84_.field_w_1492 = this.field_w_1492;
		rsmodel_84_.field_i_1464 = this.field_i_1464;
		rsmodel_84_.vertex_skin = this.vertex_skin;
		rsmodel_84_.field_ae_1476 = this.field_ae_1476;
		rsmodel_84_.field_ax_1477 = this.field_ax_1477;
		rsmodel_84_.field_al_1478 = this.field_al_1478;
		rsmodel_84_.normals = this.normals;
		rsmodel_84_.field_ar_1479 = this.field_ar_1479;
		rsmodel_84_.field_ao_1482 = field_ao_1482;
		rsmodel_84_.field_ac_1483 = field_ac_1483;
		return rsmodel_84_;
	}

	public OffScreenModel method_a_cy(final int[][] is, final int i, final int i_85_, final int i_86_, final boolean bool, final int i_87_) {
		method_w_void();
		int i_88_ = i + this.field_aa_1486;
		int i_89_ = i + this.field_an_1487;
		int i_90_ = i_86_ + this.field_ai_1489;
		int i_91_ = i_86_ + this.field_aw_1473;
		if ((i_88_ >= 0) && (((i_89_ + 128) >> 7) < is.length) && (i_90_ >= 0) && (((i_91_ + 128) >> 7) < is[0].length)) {
			i_88_ >>= 7;
			i_89_ = (i_89_ + 127) >> 7;
		i_90_ >>= 7;
		i_91_ = (i_91_ + 127) >> 7;
		if ((is[i_88_][i_90_] == i_85_) && (is[i_89_][i_90_] == i_85_) && (is[i_88_][i_91_] == i_85_) && (is[i_89_][i_91_] == i_85_)) {
			return this;
		}
		OffScreenModel rsmodel_92_;
		if (bool) {
			rsmodel_92_ = new OffScreenModel();
			rsmodel_92_.verticeCount = this.verticeCount;
			rsmodel_92_.triangleCount = this.triangleCount;
			rsmodel_92_.texturedTriangleCount = this.texturedTriangleCount;
			rsmodel_92_.vertexX = this.vertexX;
			rsmodel_92_.vertexY = this.vertexY;
			rsmodel_92_.triangleA = this.triangleA;
			rsmodel_92_.triangleB = this.triangleB;
			rsmodel_92_.triangleC = this.triangleC;
			rsmodel_92_.texMapX = this.texMapX;
			rsmodel_92_.texMapY = this.texMapY;
			rsmodel_92_.field_l_1469 = this.field_l_1469;
			rsmodel_92_.field_u_1449 = this.field_u_1449;
			rsmodel_92_.triangleColors = this.triangleColors;
			rsmodel_92_.texMapZ = this.texMapZ;
			rsmodel_92_.field_x_1462 = this.field_x_1462;
			rsmodel_92_.field_j_1472 = this.field_j_1472;
			rsmodel_92_.field_s_1465 = this.field_s_1465;
			rsmodel_92_.field_v_1452 = this.field_v_1452;
			rsmodel_92_.field_c_1484 = this.field_c_1484;
			rsmodel_92_.field_p_1468 = this.field_p_1468;
			rsmodel_92_.field_o_1458 = this.field_o_1458;
			rsmodel_92_.field_b_1494 = this.field_b_1494;
			rsmodel_92_.field_t_1471 = this.field_t_1471;
			rsmodel_92_.field_ad_1474 = this.field_ad_1474;
			rsmodel_92_.field_w_1492 = this.field_w_1492;
			rsmodel_92_.field_i_1464 = this.field_i_1464;
			rsmodel_92_.vertex_skin = this.vertex_skin;
			rsmodel_92_.field_ae_1476 = this.field_ae_1476;
			rsmodel_92_.field_ax_1477 = this.field_ax_1477;
			rsmodel_92_.field_al_1478 = this.field_al_1478;
			rsmodel_92_.field_ao_1482 = field_ao_1482;
			rsmodel_92_.field_ac_1483 = field_ac_1483;
			rsmodel_92_.vertexZ = new int[rsmodel_92_.verticeCount];
		} else {
			rsmodel_92_ = this;
		}
		if (i_87_ == 0) {
			for (int i_93_ = 0; i_93_ < rsmodel_92_.verticeCount; i_93_++) {
				final int i_94_ = this.vertexX[i_93_] + i;
				final int i_95_ = this.vertexY[i_93_] + i_86_;
				final int i_96_ = i_94_ & 0x7f;
				final int i_97_ = i_95_ & 0x7f;
				final int i_98_ = i_94_ >> 7;
			final int i_99_ = i_95_ >> 7;
			final int i_100_ = (((is[i_98_][i_99_] * (128 - i_96_)) + (is[i_98_ + 1][i_99_] * i_96_)) >> 7);
			final int i_101_ = (((is[i_98_][i_99_ + 1] * (128 - i_96_)) + (is[i_98_ + 1][i_99_ + 1] * i_96_)) >> 7);
			final int i_102_ = ((i_100_ * (128 - i_97_)) + (i_101_ * i_97_)) >> 7;
			rsmodel_92_.vertexZ[i_93_] = (this.vertexZ[i_93_] + i_102_) - i_85_;
			}
		} else {
			for (int i_103_ = 0; i_103_ < rsmodel_92_.verticeCount; i_103_++) {
				final int i_104_ = ((-this.vertexZ[i_103_] << 16) / (modelHeight * -1707560315));
				if (i_104_ < i_87_) {
					final int i_105_ = this.vertexX[i_103_] + i;
					final int i_106_ = this.vertexY[i_103_] + i_86_;
					final int i_107_ = i_105_ & 0x7f;
					final int i_108_ = i_106_ & 0x7f;
					final int i_109_ = i_105_ >> 7;
				final int i_110_ = i_106_ >> 7;
				final int i_111_ = (((is[i_109_][i_110_] * (128 - i_107_)) + (is[i_109_ + 1][i_110_] * i_107_)) >> 7);
				final int i_112_ = (((is[i_109_][i_110_ + 1] * (128 - i_107_)) + (is[i_109_ + 1][i_110_ + 1] * i_107_)) >> 7);
				final int i_113_ = ((i_111_ * (128 - i_108_)) + (i_112_ * i_108_)) >> 7;
				rsmodel_92_.vertexZ[i_103_] = (this.vertexZ[i_103_] + (((i_113_ - i_85_) * (i_87_ - i_104_)) / i_87_));
				}
			}
		}
		rsmodel_92_.method_p_void();
		return rsmodel_92_;
		}
		return this;
	}

	public void method_l_void() {
		for (int i = 0; i < this.verticeCount; i++) {
			final int i_114_ = this.vertexX[i];
			this.vertexX[i] = this.vertexY[i];
			this.vertexY[i] = -i_114_;
		}
		method_p_void();
	}

	public void method_u_void() {
		for (int i = 0; i < this.verticeCount; i++) {
			this.vertexX[i] = -this.vertexX[i];
			this.vertexY[i] = -this.vertexY[i];
		}
		method_p_void();
	}

	public void method_q_void() {
		for (int i = 0; i < this.verticeCount; i++) {
			final int i_115_ = this.vertexY[i];
			this.vertexY[i] = this.vertexX[i];
			this.vertexX[i] = -i_115_;
		}
		method_p_void();
	}

	public void method_x_void(final int i, final int i_116_, final int i_117_) {
		for (int i_118_ = 0; i_118_ < this.verticeCount; i_118_++) {
			this.vertexX[i_118_] += i;
			this.vertexZ[i_118_] += i_116_;
			this.vertexY[i_118_] += i_117_;
		}
		method_p_void();
	}

	public void method_v_void(final int i, final int i_119_, final int i_120_) {
		for (int i_121_ = 0; i_121_ < this.verticeCount; i_121_++) {
			this.vertexX[i_121_] = (this.vertexX[i_121_] * i) / 128;
			this.vertexZ[i_121_] = (this.vertexZ[i_121_] * i_119_) / 128;
			this.vertexY[i_121_] = (this.vertexY[i_121_] * i_120_) / 128;
		}
		method_p_void();
	}

	public void method_c_void() {
		if (this.normals == null) {
			this.normals = new Vector3[this.verticeCount];
			for (int i = 0; i < this.verticeCount; i++) {
				this.normals[i] = new Vector3();
			}
			for (int i = 0; i < this.triangleCount; i++) {
				final int i_122_ = this.triangleA[i];
				final int i_123_ = this.triangleB[i];
				final int i_124_ = this.triangleC[i];
				final int i_125_ = (this.vertexX[i_123_] - this.vertexX[i_122_]);
				final int i_126_ = (this.vertexZ[i_123_] - this.vertexZ[i_122_]);
				final int i_127_ = (this.vertexY[i_123_] - this.vertexY[i_122_]);
				final int i_128_ = (this.vertexX[i_124_] - this.vertexX[i_122_]);
				final int i_129_ = (this.vertexZ[i_124_] - this.vertexZ[i_122_]);
				final int i_130_ = (this.vertexY[i_124_] - this.vertexY[i_122_]);
				int i_131_ = (i_126_ * i_130_) - (i_129_ * i_127_);
				int i_132_ = (i_127_ * i_128_) - (i_130_ * i_125_);
				int i_133_;
				for (i_133_ = (i_125_ * i_129_) - (i_128_ * i_126_); ((i_131_ > 8192) || (i_132_ > 8192) || (i_133_ > 8192) || (i_131_ < -8192) || (i_132_ < -8192) || (i_133_ < -8192)); i_133_ >>= 1) {
					i_131_ >>= 1;
				i_132_ >>= 1;
				}
				int i_134_ = (int) Math.sqrt((i_131_ * i_131_) + (i_132_ * i_132_) + (i_133_ * i_133_));
				if (i_134_ <= 0) {
					i_134_ = 1;
				}
				i_131_ = (i_131_ * 256) / i_134_;
				i_132_ = (i_132_ * 256) / i_134_;
				i_133_ = (i_133_ * 256) / i_134_;
				byte i_135_;
				if (this.texMapX == null) {
					i_135_ = (byte) 0;
				} else {
					i_135_ = this.texMapX[i];
				}
				if (i_135_ == 0) {
					Vector3 class_ca = this.normals[i_122_];
					class_ca.x += i_131_ * -254094317;
					class_ca.y += i_132_ * -310630411;
					class_ca.z += i_133_ * 1546149545;
					class_ca.magnitude += 2047378823;
					class_ca = this.normals[i_123_];
					class_ca.x += i_131_ * -254094317;
					class_ca.y += i_132_ * -310630411;
					class_ca.z += i_133_ * 1546149545;
					class_ca.magnitude += 2047378823;
					class_ca = this.normals[i_124_];
					class_ca.x += i_131_ * -254094317;
					class_ca.y += i_132_ * -310630411;
					class_ca.z += i_133_ * 1546149545;
					class_ca.magnitude += 2047378823;
				} else if (i_135_ == 1) {
					if (this.field_ar_1479 == null) {
						this.field_ar_1479 = new Class_cj[this.triangleCount];
					}
					final Class_cj class_cj = this.field_ar_1479[i] = new Class_cj();
					class_cj.field_n_1014 = i_131_ * 1877151709;
					class_cj.field_d_1015 = i_132_ * -640028705;
					class_cj.field_y_1016 = i_133_ * -567789729;
				}
			}
		}
	}

	void method_p_void() {
		this.normals = null;
		this.isolatedNormals = null;
		this.field_ar_1479 = null;
		this.field_az_1448 = false;
	}

	void method_w_void() {
		if (!this.field_az_1448) {
			modelHeight = 0;
			this.field_at_1485 = 0;
			this.field_aa_1486 = 999999;
			this.field_an_1487 = -999999;
			this.field_aw_1473 = -99999;
			this.field_ai_1489 = 99999;
			for (int i = 0; i < this.verticeCount; i++) {
				final int i_136_ = this.vertexX[i];
				final int i_137_ = this.vertexZ[i];
				final int i_138_ = this.vertexY[i];
				if (i_136_ < this.field_aa_1486) {
					this.field_aa_1486 = i_136_;
				}
				if (i_136_ > this.field_an_1487) {
					this.field_an_1487 = i_136_;
				}
				if (i_138_ < this.field_ai_1489) {
					this.field_ai_1489 = i_138_;
				}
				if (i_138_ > this.field_aw_1473) {
					this.field_aw_1473 = i_138_;
				}
				if (-i_137_ > (modelHeight * -1707560315)) {
					modelHeight = -i_137_ * -891980211;
				}
				if (i_137_ > this.field_at_1485) {
					this.field_at_1485 = i_137_;
				}
			}
			this.field_az_1448 = true;
		}
	}

	static void method_i_void(final OffScreenModel rsmodel, final OffScreenModel rsmodel_139_, final int i, final int i_140_, final int i_141_, final boolean bool) {
		rsmodel.method_w_void();
		rsmodel.method_c_void();
		rsmodel_139_.method_w_void();
		rsmodel_139_.method_c_void();
		field_ay_1466++;
		int i_142_ = 0;
		final int[] is = rsmodel_139_.vertexX;
		final int i_143_ = rsmodel_139_.verticeCount;
		for (int i_144_ = 0; i_144_ < rsmodel.verticeCount; i_144_++) {
			final Vector3 class_ca = rsmodel.normals[i_144_];
			if ((class_ca.magnitude * -2142359497) != 0) {
				final int i_145_ = rsmodel.vertexZ[i_144_] - i_140_;
				if (i_145_ <= rsmodel_139_.field_at_1485) {
					final int i_146_ = rsmodel.vertexX[i_144_] - i;
					if ((i_146_ >= rsmodel_139_.field_aa_1486) && (i_146_ <= rsmodel_139_.field_an_1487)) {
						final int i_147_ = rsmodel.vertexY[i_144_] - i_141_;
						if ((i_147_ >= rsmodel_139_.field_ai_1489) && (i_147_ <= rsmodel_139_.field_aw_1473)) {
							for (int i_148_ = 0; i_148_ < i_143_; i_148_++) {
								final Vector3 class_ca_149_ = (rsmodel_139_.normals[i_148_]);
								if ((i_146_ == is[i_148_]) && (i_147_ == (rsmodel_139_.vertexY[i_148_])) && (i_145_ == (rsmodel_139_.vertexZ[i_148_])) && ((class_ca_149_.magnitude * -2142359497) != 0)) {
									if (rsmodel.isolatedNormals == null) {
										rsmodel.isolatedNormals = new Vector3[(rsmodel.verticeCount)];
									}
									if (rsmodel_139_.isolatedNormals == null) {
										rsmodel_139_.isolatedNormals = new Vector3[i_143_];
									}
									Vector3 class_ca_150_ = (rsmodel.isolatedNormals[i_144_]);
									if (class_ca_150_ == null) {
										class_ca_150_ = rsmodel.isolatedNormals[i_144_] = new Vector3(class_ca);
									}
									Vector3 class_ca_151_ = (rsmodel_139_.isolatedNormals[i_148_]);
									if (class_ca_151_ == null) {
										class_ca_151_ = rsmodel_139_.isolatedNormals[i_148_] = new Vector3(class_ca_149_);
									}
									class_ca_150_.x += (class_ca_149_.x) * 1;
									class_ca_150_.y += (class_ca_149_.y) * 1;
									class_ca_150_.z += (class_ca_149_.z) * 1;
									class_ca_150_.magnitude += (class_ca_149_.magnitude) * 1;
									class_ca_151_.x += (class_ca.x * 1);
									class_ca_151_.y += (class_ca.y * 1);
									class_ca_151_.z += (class_ca.z * 1);
									class_ca_151_.magnitude += (class_ca.magnitude * 1);
									i_142_++;
									field_ah_1463[i_144_] = field_ay_1466;
									field_aq_1491[i_148_] = field_ay_1466;
								}
							}
						}
					}
				}
			}
		}
		if ((i_142_ >= 3) && bool) {
			for (int i_152_ = 0; i_152_ < rsmodel.triangleCount; i_152_++) {
				if ((field_ah_1463[rsmodel.triangleA[i_152_]] == field_ay_1466) && (field_ah_1463[rsmodel.triangleB[i_152_]] == field_ay_1466) && (field_ah_1463[rsmodel.triangleC[i_152_]] == field_ay_1466)) {
					if (rsmodel.texMapX == null) {
						rsmodel.texMapX = new byte[rsmodel.triangleCount];
					}
					rsmodel.texMapX[i_152_] = (byte) 2;
				}
			}
			for (int i_153_ = 0; i_153_ < rsmodel_139_.triangleCount; i_153_++) {
				if ((field_aq_1491[rsmodel_139_.triangleA[i_153_]] == field_ay_1466) && (field_aq_1491[(rsmodel_139_.triangleB[i_153_])] == field_ay_1466) && (field_aq_1491[(rsmodel_139_.triangleC[i_153_])] == field_ay_1466)) {
					if (rsmodel_139_.texMapX == null) {
						rsmodel_139_.texMapX = new byte[rsmodel_139_.triangleCount];
					}
					rsmodel_139_.texMapX[i_153_] = (byte) 2;
				}
			}
		}
	}

	@SuppressWarnings("unused")
	void method_y_void(final byte[] is) {
		boolean bool = false;
		boolean bool_154_ = false;
		final Buffer rsbytebuffer = new Buffer(is);
		final Buffer rsbytebuffer_155_ = new Buffer(is);
		final Buffer rsbytebuffer_156_ = new Buffer(is);
		final Buffer rsbytebuffer_157_ = new Buffer(is);
		final Buffer rsbytebuffer_158_ = new Buffer(is);
		rsbytebuffer.position = (is.length - 18) * -685856689;
		final int i = rsbytebuffer.getShort();
		final int i_159_ = rsbytebuffer.getShort();
		final int i_160_ = rsbytebuffer.get();
		final int i_161_ = rsbytebuffer.get();
		final int i_162_ = rsbytebuffer.get();
		final int i_163_ = rsbytebuffer.get();
		final int i_164_ = rsbytebuffer.get();
		final int i_165_ = rsbytebuffer.get();
		final int i_166_ = rsbytebuffer.getShort();
		final int i_167_ = rsbytebuffer.getShort();
		final int i_168_ = rsbytebuffer.getShort();
		final int i_169_ = rsbytebuffer.getShort();
		final int i_170_ = 0;
		int i_171_ = i_170_ + i;
		final int i_172_ = i_171_;
		i_171_ += i_159_;
		final int i_173_ = i_171_;
		if (i_162_ == 255) {
			i_171_ += i_159_;
		}
		final int i_174_ = i_171_;
		if (i_164_ == 1) {
			i_171_ += i_159_;
		}
		final int i_175_ = i_171_;
		if (i_161_ == 1) {
			i_171_ += i_159_;
		}
		final int i_176_ = i_171_;
		if (i_165_ == 1) {
			i_171_ += i;
		}
		final int i_177_ = i_171_;
		if (i_163_ == 1) {
			i_171_ += i_159_;
		}
		final int i_178_ = i_171_;
		i_171_ += i_169_;
		final int i_179_ = i_171_;
		i_171_ += i_159_ * 2;
		final int i_180_ = i_171_;
		i_171_ += i_160_ * 6;
		final int i_181_ = i_171_;
		i_171_ += i_166_;
		final int i_182_ = i_171_;
		i_171_ += i_167_;
		this.verticeCount = i;
		this.triangleCount = i_159_;
		this.texturedTriangleCount = i_160_;
		this.vertexX = new int[i];
		this.vertexZ = new int[i];
		this.vertexY = new int[i];
		this.triangleA = new int[i_159_];
		this.triangleB = new int[i_159_];
		this.triangleC = new int[i_159_];
		if (i_160_ > 0) {
			this.field_j_1472 = new byte[i_160_];
			this.field_s_1465 = new short[i_160_];
			this.field_v_1452 = new short[i_160_];
			this.field_c_1484 = new short[i_160_];
		}
		if (i_165_ == 1) {
			this.vertex_skin = new int[i];
		}
		if (i_161_ == 1) {
			this.texMapX = new byte[i_159_];
			this.field_u_1449 = new byte[i_159_];
			this.texMapZ = new short[i_159_];
		}
		if (i_162_ == 255) {
			this.texMapY = new byte[i_159_];
		} else {
			this.field_x_1462 = (byte) i_162_;
		}
		if (i_163_ == 1) {
			this.field_l_1469 = new byte[i_159_];
		}
		if (i_164_ == 1) {
			this.field_ae_1476 = new int[i_159_];
		}
		this.triangleColors = new short[i_159_];
		rsbytebuffer.position = i_170_ * -685856689;
		rsbytebuffer_155_.position = i_181_ * -685856689;
		rsbytebuffer_156_.position = i_182_ * -685856689;
		rsbytebuffer_157_.position = i_171_ * -685856689;
		rsbytebuffer_158_.position = i_176_ * -685856689;
		int i_184_ = 0;
		int i_185_ = 0;
		int i_186_ = 0;
		for (int i_187_ = 0; i_187_ < i; i_187_++) {
			final int i_188_ = rsbytebuffer.get();
			int i_189_ = 0;
			if ((i_188_ & 0x1) != 0) {
				i_189_ = rsbytebuffer_155_.method_al_int((byte) -89);
			}
			int i_190_ = 0;
			if ((i_188_ & 0x2) != 0) {
				i_190_ = rsbytebuffer_156_.method_al_int((byte) -65);
			}
			int i_191_ = 0;
			if ((i_188_ & 0x4) != 0) {
				i_191_ = rsbytebuffer_157_.method_al_int((byte) -18);
			}
			this.vertexX[i_187_] = i_184_ + i_189_;
			this.vertexZ[i_187_] = i_185_ + i_190_;
			this.vertexY[i_187_] = i_186_ + i_191_;
			i_184_ = this.vertexX[i_187_];
			i_185_ = this.vertexZ[i_187_];
			i_186_ = this.vertexY[i_187_];
			if (i_165_ == 1) {
				this.vertex_skin[i_187_] = rsbytebuffer_158_.get();
			}
		}
		rsbytebuffer.position = i_179_ * -685856689;
		rsbytebuffer_155_.position = i_175_ * -685856689;
		rsbytebuffer_156_.position = i_173_ * -685856689;
		rsbytebuffer_157_.position = i_177_ * -685856689;
		rsbytebuffer_158_.position = i_174_ * -685856689;
		for (int i_192_ = 0; i_192_ < i_159_; i_192_++) {
			this.triangleColors[i_192_] = (short) rsbytebuffer.getShort();
			if (i_161_ == 1) {
				final int i_193_ = rsbytebuffer_155_.get();
				if ((i_193_ & 0x1) == 1) {
					this.texMapX[i_192_] = (byte) 1;
					bool = true;
				} else {
					this.texMapX[i_192_] = (byte) 0;
				}
				if ((i_193_ & 0x2) == 2) {
					this.field_u_1449[i_192_] = (byte) (i_193_ >> 2);
					this.texMapZ[i_192_] = this.triangleColors[i_192_];
					this.triangleColors[i_192_] = (short) 127;
					if (this.texMapZ[i_192_] != -1) {
						bool_154_ = true;
					}
				} else {
					this.field_u_1449[i_192_] = (byte) -1;
					this.texMapZ[i_192_] = (short) -1;
				}
			}
			if (i_162_ == 255) {
				this.texMapY[i_192_] = rsbytebuffer_156_.getSigned();
			}
			if (i_163_ == 1) {
				this.field_l_1469[i_192_] = rsbytebuffer_157_.getSigned();
			}
			if (i_164_ == 1) {
				this.field_ae_1476[i_192_] = rsbytebuffer_158_.get();
			}
		}
		rsbytebuffer.position = i_178_ * -685856689;
		rsbytebuffer_155_.position = i_172_ * -685856689;
		int i_194_ = 0;
		int i_195_ = 0;
		int i_196_ = 0;
		int i_197_ = 0;
		for (int i_198_ = 0; i_198_ < i_159_; i_198_++) {
			final int i_199_ = rsbytebuffer_155_.get();
			if (i_199_ == 1) {
				i_194_ = rsbytebuffer.method_al_int((byte) -42) + i_197_;
				i_195_ = rsbytebuffer.method_al_int((byte) -50) + i_194_;
				i_196_ = rsbytebuffer.method_al_int((byte) -17) + i_195_;
				i_197_ = i_196_;
				this.triangleA[i_198_] = i_194_;
				this.triangleB[i_198_] = i_195_;
				this.triangleC[i_198_] = i_196_;
			}
			if (i_199_ == 2) {
				i_195_ = i_196_;
				i_196_ = rsbytebuffer.method_al_int((byte) -3) + i_197_;
				i_197_ = i_196_;
				this.triangleA[i_198_] = i_194_;
				this.triangleB[i_198_] = i_195_;
				this.triangleC[i_198_] = i_196_;
			}
			if (i_199_ == 3) {
				i_194_ = i_196_;
				i_196_ = rsbytebuffer.method_al_int((byte) -33) + i_197_;
				i_197_ = i_196_;
				this.triangleA[i_198_] = i_194_;
				this.triangleB[i_198_] = i_195_;
				this.triangleC[i_198_] = i_196_;
			}
			if (i_199_ == 4) {
				final int i_200_ = i_194_;
				i_194_ = i_195_;
				i_195_ = i_200_;
				i_196_ = rsbytebuffer.method_al_int((byte) -19) + i_197_;
				i_197_ = i_196_;
				this.triangleA[i_198_] = i_194_;
				this.triangleB[i_198_] = i_200_;
				this.triangleC[i_198_] = i_196_;
			}
		}
		rsbytebuffer.position = i_180_ * -685856689;
		for (int i_201_ = 0; i_201_ < i_160_; i_201_++) {
			this.field_j_1472[i_201_] = (byte) 0;
			this.field_s_1465[i_201_] = (short) rsbytebuffer.getShort();
			this.field_v_1452[i_201_] = (short) rsbytebuffer.getShort();
			this.field_c_1484[i_201_] = (short) rsbytebuffer.getShort();
		}
		if (this.field_u_1449 != null) {
			boolean bool_202_ = false;
			for (int i_203_ = 0; i_203_ < i_159_; i_203_++) {
				final int i_204_ = this.field_u_1449[i_203_] & 0xff;
				if (i_204_ != 255) {
					if (((this.field_s_1465[i_204_] & 0xffff) == this.triangleA[i_203_]) && ((this.field_v_1452[i_204_] & 0xffff) == this.triangleB[i_203_]) && ((this.field_c_1484[i_204_] & 0xffff) == this.triangleC[i_203_])) {
						this.field_u_1449[i_203_] = (byte) -1;
					} else {
						bool_202_ = true;
					}
				}
			}
			if (!bool_202_) {
				this.field_u_1449 = null;
			}
		}
		if (!bool_154_) {
			this.texMapZ = null;
		}
		if (!bool) {
			this.texMapX = null;
		}
	}

	static final int method_ae_int(int i) {
		if (i < 2) {
			i = 2;
		} else if (i > 126) {
			i = 126;
		}
		return i;
	}

	public final Model method_ad_cg(final int i, final int i_205_, final int i_206_, final int i_207_, final int i_208_) {
		method_c_void();
		final int i_209_ = (int) Math.sqrt((i_206_ * i_206_) + (i_207_ * i_207_) + (i_208_ * i_208_));
		final int i_210_ = (i_205_ * i_209_) >> 8;
			final Model onscreenmodel = new Model();
			onscreenmodel.triangleColors = new int[this.triangleCount];
			onscreenmodel.texMapX = new int[this.triangleCount];
			onscreenmodel.texMapY = new int[this.triangleCount];
			if ((this.texturedTriangleCount > 0) && (this.field_u_1449 != null)) {
				final int[] is = new int[this.texturedTriangleCount];
				for (int i_211_ = 0; i_211_ < this.triangleCount; i_211_++) {
					if (this.field_u_1449[i_211_] != -1) {
						is[this.field_u_1449[i_211_] & 0xff]++;
					}
				}
				onscreenmodel.field_p_899 = 0;
				for (int i_212_ = 0; i_212_ < this.texturedTriangleCount; i_212_++) {
					if ((is[i_212_] > 0) && (this.field_j_1472[i_212_] == 0)) {
						onscreenmodel.field_p_899++;
					}
				}
				onscreenmodel.field_o_898 = new int[onscreenmodel.field_p_899];
				onscreenmodel.field_b_886 = new int[onscreenmodel.field_p_899];
				onscreenmodel.field_t_864 = new int[onscreenmodel.field_p_899];
				int i_213_ = 0;
				for (int i_214_ = 0; i_214_ < this.texturedTriangleCount; i_214_++) {
					if ((is[i_214_] > 0) && (this.field_j_1472[i_214_] == 0)) {
						onscreenmodel.field_o_898[i_213_] = this.field_s_1465[i_214_] & 0xffff;
						onscreenmodel.field_b_886[i_213_] = this.field_v_1452[i_214_] & 0xffff;
						onscreenmodel.field_t_864[i_213_] = this.field_c_1484[i_214_] & 0xffff;
						is[i_214_] = i_213_++;
					} else {
						is[i_214_] = -1;
					}
				}
				onscreenmodel.field_s_914 = new byte[this.triangleCount];
				for (int i_215_ = 0; i_215_ < this.triangleCount; i_215_++) {
					if (this.field_u_1449[i_215_] != -1) {
						onscreenmodel.field_s_914[i_215_] = (byte) is[(this.field_u_1449[i_215_] & 0xff)];
					} else {
						onscreenmodel.field_s_914[i_215_] = (byte) -1;
					}
				}
			}
			for (int i_216_ = 0; i_216_ < this.triangleCount; i_216_++) {
				byte i_217_;
				if (this.texMapX == null) {
					i_217_ = (byte) 0;
				} else {
					i_217_ = this.texMapX[i_216_];
				}
				byte i_218_;
				if (this.field_l_1469 == null) {
					i_218_ = (byte) 0;
				} else {
					i_218_ = this.field_l_1469[i_216_];
				}
				short i_219_;
				if (this.texMapZ == null) {
					i_219_ = (short) -1;
				} else {
					i_219_ = this.texMapZ[i_216_];
				}
				if (i_218_ == -2) {
					i_217_ = (byte) 3;
				}
				if (i_218_ == -1) {
					i_217_ = (byte) 2;
				}
				if (i_219_ == -1) {
					if (i_217_ == 0) {
						final int i_220_ = this.triangleColors[i_216_] & 0xffff;
						Vector3 class_ca;
						if ((this.isolatedNormals != null) && ((this.isolatedNormals[this.triangleA[i_216_]]) != null)) {
							class_ca = (this.isolatedNormals[this.triangleA[i_216_]]);
						} else {
							class_ca = (this.normals[this.triangleA[i_216_]]);
						}
						int i_221_ = i + (((i_206_ * class_ca.x * -1396304357) + (i_207_ * class_ca.y * -1842475939) + (i_208_ * class_ca.z * 1481188761)) / (i_210_ * class_ca.magnitude * -2142359497));
						onscreenmodel.triangleColors[i_216_] = method_ak_int(i_220_, i_221_);
						if ((this.isolatedNormals != null) && ((this.isolatedNormals[this.triangleB[i_216_]]) != null)) {
							class_ca = (this.isolatedNormals[this.triangleB[i_216_]]);
						} else {
							class_ca = (this.normals[this.triangleB[i_216_]]);
						}
						i_221_ = i + (((i_206_ * class_ca.x * -1396304357) + (i_207_ * class_ca.y * -1842475939) + (i_208_ * class_ca.z * 1481188761)) / (i_210_ * class_ca.magnitude * -2142359497));
						onscreenmodel.texMapX[i_216_] = method_ak_int(i_220_, i_221_);
						if ((this.isolatedNormals != null) && ((this.isolatedNormals[this.triangleC[i_216_]]) != null)) {
							class_ca = (this.isolatedNormals[this.triangleC[i_216_]]);
						} else {
							class_ca = (this.normals[this.triangleC[i_216_]]);
						}
						i_221_ = i + (((i_206_ * class_ca.x * -1396304357) + (i_207_ * class_ca.y * -1842475939) + (i_208_ * class_ca.z * 1481188761)) / (i_210_ * class_ca.magnitude * -2142359497));
						onscreenmodel.texMapY[i_216_] = method_ak_int(i_220_, i_221_);
					} else if (i_217_ == 1) {
						final Class_cj class_cj = this.field_ar_1479[i_216_];
						final int i_222_ = i + (((i_206_ * class_cj.field_n_1014 * 1801764981) + (i_207_ * class_cj.field_d_1015 * -1504539617) + (i_208_ * class_cj.field_y_1016 * 1366025375)) / (i_210_ + (i_210_ / 2)));
						onscreenmodel.triangleColors[i_216_] = method_ak_int((this.triangleColors[i_216_]) & 0xffff, i_222_);
						onscreenmodel.texMapY[i_216_] = -1;
					} else if (i_217_ == 3) {
						onscreenmodel.triangleColors[i_216_] = 128;
						onscreenmodel.texMapY[i_216_] = -1;
					} else {
						onscreenmodel.texMapY[i_216_] = -2;
					}
				} else if (i_217_ == 0) {
					Vector3 class_ca;
					if ((this.isolatedNormals != null) && ((this.isolatedNormals[this.triangleA[i_216_]]) != null)) {
						class_ca = (this.isolatedNormals[this.triangleA[i_216_]]);
					} else {
						class_ca = (this.normals[this.triangleA[i_216_]]);
					}
					int i_223_ = i + (((i_206_ * class_ca.x * -1396304357) + (i_207_ * class_ca.y * -1842475939) + (i_208_ * class_ca.z * 1481188761)) / (i_210_ * class_ca.magnitude * -2142359497));
					onscreenmodel.triangleColors[i_216_] = method_ae_int(i_223_);
					if ((this.isolatedNormals != null) && ((this.isolatedNormals[this.triangleB[i_216_]]) != null)) {
						class_ca = (this.isolatedNormals[this.triangleB[i_216_]]);
					} else {
						class_ca = (this.normals[this.triangleB[i_216_]]);
					}
					i_223_ = i + (((i_206_ * class_ca.x * -1396304357) + (i_207_ * class_ca.y * -1842475939) + (i_208_ * class_ca.z * 1481188761)) / (i_210_ * class_ca.magnitude * -2142359497));
					onscreenmodel.texMapX[i_216_] = method_ae_int(i_223_);
					if ((this.isolatedNormals != null) && ((this.isolatedNormals[this.triangleC[i_216_]]) != null)) {
						class_ca = (this.isolatedNormals[this.triangleC[i_216_]]);
					} else {
						class_ca = (this.normals[this.triangleC[i_216_]]);
					}
					i_223_ = i + (((i_206_ * class_ca.x * -1396304357) + (i_207_ * class_ca.y * -1842475939) + (i_208_ * class_ca.z * 1481188761)) / (i_210_ * class_ca.magnitude * -2142359497));
					onscreenmodel.texMapY[i_216_] = method_ae_int(i_223_);
				} else if (i_217_ == 1) {
					final Class_cj class_cj = this.field_ar_1479[i_216_];
					final int i_224_ = i + (((i_206_ * class_cj.field_n_1014 * 1801764981) + (i_207_ * class_cj.field_d_1015 * -1504539617) + (i_208_ * class_cj.field_y_1016 * 1366025375)) / (i_210_ + (i_210_ / 2)));
					onscreenmodel.triangleColors[i_216_] = method_ae_int(i_224_);
					onscreenmodel.texMapY[i_216_] = -1;
				} else {
					onscreenmodel.texMapY[i_216_] = -2;
				}
			}
			method_h_void();
			onscreenmodel.verticeCount = this.verticeCount;
			onscreenmodel.vertexX = this.vertexX;
			onscreenmodel.vertexZ = this.vertexZ;
			onscreenmodel.vertexY = this.vertexY;
			onscreenmodel.triangleCount = this.triangleCount;
			onscreenmodel.triangleA = this.triangleA;
			onscreenmodel.triangleB = this.triangleB;
			onscreenmodel.triangleC = this.triangleC;
			onscreenmodel.texMapZ = this.texMapY;
			onscreenmodel.field_j_909 = this.field_l_1469;
			onscreenmodel.field_c_883 = this.field_x_1462;
			onscreenmodel.field_w_888 = this.field_ax_1477;
			onscreenmodel.field_i_889 = this.field_al_1478;
			onscreenmodel.field_v_890 = this.texMapZ;
			return onscreenmodel;
	}

	public void retexture(final short i, final short i_225_) {
		if (this.texMapZ != null) {
			for (int i_226_ = 0; i_226_ < this.triangleCount; i_226_++) {
				if (this.texMapZ[i_226_] == i) {
					this.texMapZ[i_226_] = i_225_;
				}
			}
		}
	}

	public void recolor(final short i, final short i_227_) {
		for (int i_228_ = 0; i_228_ < this.triangleCount; i_228_++) {
			if (this.triangleColors[i_228_] == i) {
				this.triangleColors[i_228_] = i_227_;
			}
		}
	}

	static final int method_ak_int(final int i, int i_229_) {
		i_229_ = (i_229_ * (i & 0x7f)) >> 7;
		if (i_229_ < 2) {
			i_229_ = 2;
		} else if (i_229_ > 126) {
			i_229_ = 126;
		}
		return (i & 0xff80) + i_229_;
	}

	void method_h_void() {
		if (this.vertex_skin != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_230_ = 0; i_230_ < this.verticeCount; i_230_++) {
				final int i_231_ = this.vertex_skin[i_230_];
				is[i_231_]++;
				if (i_231_ > i) {
					i = i_231_;
				}
			}
			this.field_ax_1477 = new int[i + 1][];
			for (int i_232_ = 0; i_232_ <= i; i_232_++) {
				this.field_ax_1477[i_232_] = new int[is[i_232_]];
				is[i_232_] = 0;
			}
			int i_233_ = 0;
			while (i_233_ < this.verticeCount) {
				final int i_234_ = this.vertex_skin[i_233_];
				this.field_ax_1477[i_234_][is[i_234_]++] = i_233_++;
			}
			this.vertex_skin = null;
		}
		if (this.field_ae_1476 != null) {
			final int[] is = new int[256];
			int i = 0;
			for (int i_235_ = 0; i_235_ < this.triangleCount; i_235_++) {
				final int i_236_ = this.field_ae_1476[i_235_];
				is[i_236_]++;
				if (i_236_ > i) {
					i = i_236_;
				}
			}
			this.field_al_1478 = new int[i + 1][];
			for (int i_237_ = 0; i_237_ <= i; i_237_++) {
				this.field_al_1478[i_237_] = new int[is[i_237_]];
				is[i_237_] = 0;
			}
			int i_238_ = 0;
			while (i_238_ < this.triangleCount) {
				final int i_239_ = this.field_ae_1476[i_238_];
				this.field_al_1478[i_239_][is[i_239_]++] = i_238_++;
			}
			this.field_ae_1476 = null;
		}
	}

	public void method_s_void() {
		for (int i = 0; i < this.verticeCount; i++) {
			this.vertexY[i] = -this.vertexY[i];
		}
		for (int i = 0; i < this.triangleCount; i++) {
			final int i_240_ = this.triangleA[i];
			this.triangleA[i] = this.triangleC[i];
			this.triangleC[i] = i_240_;
		}
		method_p_void();
	}

	final int method_e_int(final OffScreenModel rsmodel_241_, final int i) {
		int i_242_ = -1;
		final int i_243_ = rsmodel_241_.vertexX[i];
		final int i_244_ = rsmodel_241_.vertexZ[i];
		final int i_245_ = rsmodel_241_.vertexY[i];
		for (int i_246_ = 0; i_246_ < this.verticeCount; i_246_++) {
			if ((i_243_ == this.vertexX[i_246_]) && (i_244_ == this.vertexZ[i_246_]) && (i_245_ == this.vertexY[i_246_])) {
				i_242_ = i_246_;
				break;
			}
		}
		if (i_242_ == -1) {
			this.vertexX[this.verticeCount] = i_243_;
			this.vertexZ[this.verticeCount] = i_244_;
			this.vertexY[this.verticeCount] = i_245_;
			if (rsmodel_241_.vertex_skin != null) {
				this.vertex_skin[this.verticeCount] = rsmodel_241_.vertex_skin[i];
			}
			i_242_ = this.verticeCount++;
		}
		return i_242_;
	}

	OffScreenModel() {
		/* empty */
	}
}
