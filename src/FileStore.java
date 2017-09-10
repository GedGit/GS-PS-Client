/* Class_fs - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */

public abstract class FileStore {
	Object[][] children;
	public static final int field_by_2474 = 138;
	int[] field_z_2475;
	public static final int field_bu_2476 = 5;
	boolean field_x_2477;
	int[] field_g_2478;
	int[] field_f_2479;
	Class_gl field_y_2480;
	boolean discardChildren;
	Class_gl[] field_h_2482;
	Object[] field_l_2483;
	int[][] childSizes;
	int field_n_2485;
	public int crc32;
	int[][] field_a_2487;
	static final ZipInflater INFLATER = new ZipInflater();
	static int field_j_2489 = 0;
	static final int field_v_2490 = 1;
	public static final int field_ap_2491 = 134;
	static long field_pr_2492;
	int[] field_e_2493;
	int[] field_d_2494;

	void decodeReferenceTable(final byte[] is, final short i) {
		try {
			crc32 = Class_cq.method_n_int(is, is.length, (short) -27227) * -170660811;
			final Buffer rsbytebuffer = new Buffer(Class_h.decompress(is, 2145901923));
			final int i_0_ = rsbytebuffer.get();
			if ((i_0_ >= 5) && (i_0_ <= 7)) {
				if (i_0_ >= 6) {
					rsbytebuffer.getInt();
				}
				final int i_1_ = rsbytebuffer.get();
				if (i_0_ >= 7) {
					this.field_n_2485 = rsbytebuffer.getLargeSmart() * 199154131;
				} else {
					this.field_n_2485 = rsbytebuffer.getShort() * 199154131;
				}
				int i_2_ = 0;
				int i_3_ = -1;
				this.field_d_2494 = new int[this.field_n_2485 * 360179291];
				if (i_0_ >= 7) {
					for (int i_4_ = 0; i_4_ < (this.field_n_2485 * 360179291); i_4_++) {
						this.field_d_2494[i_4_] = i_2_ += rsbytebuffer.getLargeSmart();
						if (this.field_d_2494[i_4_] > i_3_) {
							i_3_ = this.field_d_2494[i_4_];
						}
					}
				} else {
					for (int i_5_ = 0; i_5_ < (360179291 * this.field_n_2485); i_5_++) {
						this.field_d_2494[i_5_] = i_2_ += rsbytebuffer.getShort();
						if (this.field_d_2494[i_5_] > i_3_) {
							i_3_ = this.field_d_2494[i_5_];
						}
					}
				}
				this.field_e_2493 = new int[i_3_ + 1];
				this.field_g_2478 = new int[i_3_ + 1];
				this.field_f_2479 = new int[1 + i_3_];
				this.childSizes = new int[1 + i_3_][];
				this.field_l_2483 = new Object[1 + i_3_];
				this.children = new Object[1 + i_3_][];
				if (i_1_ != 0) {
					this.field_z_2475 = new int[i_3_ + 1];
					for (int i_6_ = 0; i_6_ < (this.field_n_2485 * 360179291); i_6_++) {
						this.field_z_2475[(this.field_d_2494[i_6_])] = rsbytebuffer.getInt();
					}
					this.field_y_2480 = new Class_gl(this.field_z_2475);
				}
				for (int i_7_ = 0; i_7_ < (this.field_n_2485 * 360179291); i_7_++) {
					this.field_e_2493[(this.field_d_2494[i_7_])] = rsbytebuffer.getInt();
				}
				for (int i_8_ = 0; i_8_ < (360179291 * this.field_n_2485); i_8_++) {
					this.field_g_2478[(this.field_d_2494[i_8_])] = rsbytebuffer.getInt();
				}
				for (int i_9_ = 0; i_9_ < (this.field_n_2485 * 360179291); i_9_++) {
					this.field_f_2479[(this.field_d_2494[i_9_])] = rsbytebuffer.getShort();
				}
				if (i_0_ >= 7) {
					for (int i_10_ = 0; i_10_ < (360179291 * this.field_n_2485); i_10_++) {
						final int i_11_ = this.field_d_2494[i_10_];
						final int i_12_ = this.field_f_2479[i_11_];
						i_2_ = 0;
						int i_13_ = -1;
						this.childSizes[i_11_] = new int[i_12_];
						for (int i_14_ = 0; i_14_ < i_12_; i_14_++) {
							final int i_15_ = (this.childSizes[i_11_][i_14_] = i_2_ += rsbytebuffer.getLargeSmart());
							if (i_15_ > i_13_) {
								i_13_ = i_15_;
							}
						}
						this.children[i_11_] = new Object[i_13_ + 1];
					}
				} else {
					for (int i_16_ = 0; i_16_ < (360179291 * this.field_n_2485); i_16_++) {
						final int i_17_ = this.field_d_2494[i_16_];
						final int i_18_ = this.field_f_2479[i_17_];
						i_2_ = 0;
						int i_19_ = -1;
						this.childSizes[i_17_] = new int[i_18_];
						for (int i_20_ = 0; i_20_ < i_18_; i_20_++) {
							final int i_21_ = (this.childSizes[i_17_][i_20_] = i_2_ += rsbytebuffer.getShort());
							if (i_21_ > i_19_) {
								i_19_ = i_21_;
							}
						}
						this.children[i_17_] = new Object[1 + i_19_];
					}
				}
				if (i_1_ != 0) {
					this.field_a_2487 = new int[i_3_ + 1][];
					this.field_h_2482 = new Class_gl[i_3_ + 1];
					for (int i_22_ = 0; i_22_ < (360179291 * this.field_n_2485); i_22_++) {
						final int i_23_ = this.field_d_2494[i_22_];
						final int i_24_ = this.field_f_2479[i_23_];
						this.field_a_2487[i_23_] = (new int[this.children[i_23_].length]);
						for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
							this.field_a_2487[i_23_][this.childSizes[i_23_][i_25_]] = rsbytebuffer.getInt();
						}
						this.field_h_2482[i_23_] = new Class_gl(this.field_a_2487[i_23_]);
					}
				}
			} else {
				throw new RuntimeException("");
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.n()");
		}
	}

	void method_d_void(final int i, final byte i_26_) {
		/* empty */
	}

	public byte[] getArchive(final int container, final int archive) {
		byte[] data;
		try {
			data = getArchiveData(container, archive, null);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.z()");
		}
		return data;
	}

	public void method_x_void(final int i, final int i_29_) {
		try {
			for (int i_30_ = 0; i_30_ < this.children[i].length; i_30_++) {
				this.children[i][i_30_] = null;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.x()");
		}
	}

	public boolean method_e_boolean(final int i, final int i_31_, final int i_32_) {
		do {
			boolean bool;
			try {
				if ((i < 0) || (i >= this.children.length) || (this.children[i] == null) || (i_31_ < 0) || (i_31_ >= this.children[i].length)) {
					break;
				}
				if (this.children[i][i_31_] != null) {
					return true;
				}
				if (this.field_l_2483[i] != null) {
					return true;
				}
				method_l_void(i, 1999686886);
				if (this.field_l_2483[i] != null) {
					return true;
				}
				bool = false;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "fs.e()");
			}
			return bool;
		} while (false);
		return false;
	}

	public byte[] getArchiveData(final int container, final int archive, final int[] keys) {
		do {
			byte[] data;
			try {
				if ((container < 0) || (container >= this.children.length) || (this.children[container] == null) || (archive < 0) || (archive >= this.children[container].length)) {
					break;
				}
				if (this.children[container][archive] == null) {
					boolean bool = extract(container, keys, 1919121576);
					if (!bool) {
						method_l_void(container, 1702682848);
						bool = extract(container, keys, 1919121576);
						if (!bool) {
							return null;
						}
					}
				}
				final byte[] is_36_ = Script.toByteArray((this.children[container][archive]), false, (byte) 1);
				if (this.discardChildren) {
					this.children[container][archive] = null;
				}
				data = is_36_;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "fs.y()");
			}
			return data;
		} while (false);
		return null;
	}

	public boolean method_f_boolean() {
		boolean bool;
		try {
			boolean bool_37_ = true;
			for (final int i_39_ : this.field_d_2494) {
				if (this.field_l_2483[i_39_] == null) {
					method_l_void(i_39_, 756450414);
					if (this.field_l_2483[i_39_] == null) {
						bool_37_ = false;
					}
				}
			}
			bool = bool_37_;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.f()");
		}
		return bool;
	}

	public byte[] method_m_byteArray(final int i, final short i_40_) {
		try {
			if (this.children.length == 1) {
				return getArchive(0, i);
			}
			if (this.children[i].length == 1) {
				return getArchive(i, 0);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.m()");
		}
	}

	public int[] method_u_intArray(final int i, final int i_41_) {
		int[] is;
		try {
			is = this.childSizes[i];
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.u()");
		}
		return is;
	}

	public void method_r_void(final int i) {
		try {
			for (int i_42_ = 0; i_42_ < this.children.length; i_42_++) {
				if (this.children[i_42_] != null) {
					for (int i_43_ = 0; i_43_ < this.children[i_42_].length; i_43_++) {
						this.children[i_42_][i_43_] = null;
					}
				}
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.r()");
		}
	}

	boolean extract(final int i, final int[] is, final int i_44_) {
		try {
			if (this.field_l_2483[i] == null) {
				return false;
			}
			final int size = this.field_f_2479[i];
			final int[] childSizes = this.childSizes[i];
			final Object[] children = this.children[i];
			boolean bool = true;
			for (int i_47_ = 0; i_47_ < size; i_47_++) {
				if (children[childSizes[i_47_]] == null) {
					bool = false;
					break;
				}
			}
			if (bool) {
				return true;
			}
			byte[] file;
			if ((is != null) && ((is[0] != 0) || (is[1] != 0) || (is[2] != 0) || (is[3] != 0))) {
				file = Script.toByteArray((this.field_l_2483[i]), true, (byte) 1);
				final Buffer rsbytebuffer = new Buffer(file);
				rsbytebuffer.method_at_void(is, 5, rsbytebuffer.buffer.length, (byte) -26);
			} else {
				file = Script.toByteArray((this.field_l_2483[i]), false, (byte) 1);
			}
			byte[] decompressed;
			try {
				decompressed = Class_h.decompress(file, 1247023905);
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception,
						new StringBuilder().append(is != null).append(",").append(i).append(",").append(file.length).append(",").append(Class_cq.method_n_int(file, file.length, (short) -3279)).append(",").append(Class_cq.method_n_int(file, file.length - 2, (short) -5439)).append(",").append(this.field_e_2493[i]).append(",").append(507577885 * crc32).toString());
			}
			if (this.field_x_2477) {
				this.field_l_2483[i] = null;
			}
			if (size > 1) {
				int i_50_ = decompressed.length;
				i_50_--;
				final int chunks = decompressed[i_50_] & 0xff;
				i_50_ -= 4 * size * chunks;
				final Buffer buffer = new Buffer(decompressed);
				final int[] chunkSizes = new int[size];
				buffer.position = i_50_ * -685856689;
				for (int i_53_ = 0; i_53_ < chunks; i_53_++) {
					int delta = 0;
					for (int i_55_ = 0; i_55_ < size; i_55_++) {
						delta += buffer.getInt();
						chunkSizes[i_55_] += delta;
					}
				}
				final byte[][] sizes = new byte[size][];
				for (int i_57_ = 0; i_57_ < size; i_57_++) {
					sizes[i_57_] = new byte[chunkSizes[i_57_]];
					chunkSizes[i_57_] = 0;
				}
				buffer.position = i_50_ * -685856689;
				int i_58_ = 0;
				for (int i_59_ = 0; i_59_ < chunks; i_59_++) {
					int i_60_ = 0;
					for (int i_61_ = 0; i_61_ < size; i_61_++) {
						i_60_ += buffer.getInt();
						System.arraycopy(decompressed, i_58_, sizes[i_61_], chunkSizes[i_61_], i_60_);
						chunkSizes[i_61_] += i_60_;
						i_58_ += i_60_;
					}
				}
				for (int i_62_ = 0; i_62_ < size; i_62_++) {
					if (!this.discardChildren) {
						children[childSizes[i_62_]] = Class_a.getCachedObject(sizes[i_62_], false);
					} else {
						children[childSizes[i_62_]] = sizes[i_62_];
					}
				}
			} else if (!this.discardChildren) {
				children[childSizes[0]] = Class_a.getCachedObject(decompressed, false);
			} else {
				children[childSizes[0]] = decompressed;
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.j()");
		}
		return true;
	}

	public int getByName(String string) {
		int i_63_;
		try {
			string = string.toLowerCase();
			i_63_ = this.field_y_2480.method_n_int(Class_ay.nameHash(string, -813849830));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.s()");
		}
		return i_63_;
	}

	public int getFileIndex(final int i, String string) {
		int i_65_;
		try {
			string = string.toLowerCase();
			i_65_ = this.field_h_2482[i].method_n_int(Class_ay.nameHash(string, 826248550));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.v()");
		}
		return i_65_;
	}

	public boolean exists(String string, String string_66_, final int i) {
		boolean bool;
		try {
			string = string.toLowerCase();
			string_66_ = string_66_.toLowerCase();
			final int i_67_ = this.field_y_2480.method_n_int(Class_ay.nameHash(string, 431301786));
			final int i_68_ = (this.field_h_2482[i_67_].method_n_int(Class_ay.nameHash(string_66_, 170053123)));
			bool = method_e_boolean(i_67_, i_68_, 525980573);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.p()");
		}
		return bool;
	}

	public boolean method_o_boolean(final String string, final int i) {
		boolean bool;
		try {
			final int i_69_ = getByName("");
			bool = (i_69_ != -1 ? exists("", string, -1307130441) : exists(string, "", -470611789));
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.o()");
		}
		return bool;
	}

	public void method_b_void(String string, final byte i) {
		try {
			string = string.toLowerCase();
			final int i_70_ = this.field_y_2480.method_n_int(Class_ay.nameHash(string, -309343918));
			if (i_70_ >= 0) {
				method_d_void(i_70_, (byte) 100);
			}
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.b()");
		}
	}

	public int method_q_int(final int i, final int i_71_) {
		int i_72_;
		try {
			i_72_ = this.children[i].length;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.q()");
		}
		return i_72_;
	}

	public byte[] method_c_byteArray(String string, String string_73_, final int i) {
		byte[] is;
		try {
			string = string.toLowerCase();
			string_73_ = string_73_.toLowerCase();
			final int i_74_ = this.field_y_2480.method_n_int(Class_ay.nameHash(string, 1441474321));
			final int i_75_ = (this.field_h_2482[i_74_].method_n_int(Class_ay.nameHash(string_73_, 715893027)));


			/*if (string.contains("title.jpg")) {
				System.out.println(i_74_+", "+i_75_);
			}*/
			is = getArchive(i_74_, i_75_);
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.c()");
		}
		return is;
	}

	public int method_k_int(final short i) {
		int i_76_;
		try {
			i_76_ = this.children.length;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.k()");
		}
		return i_76_;
	}

	void method_l_void(final int i, final int i_77_) {
		/* empty */
	}

	public byte[] getChildData(final int parent, final int child) {
		do {
			byte[] is;
			try {
				if ((parent < 0) || (parent >= this.children.length) || (this.children[parent] == null) || (child < 0) || (child >= this.children[parent].length)) {
					break;
				}
				if (this.children[parent][child] == null) {
					boolean extracted = extract(parent, null, 1919121576);
					if (!extracted) {
						method_l_void(parent, 1681218395);
						extracted = extract(parent, null, 1919121576);
						if (!extracted) {
							return null;
						}
					}
				}
				final byte[] is_80_ = Script.toByteArray((this.children[parent][child]), false, (byte) 1);
				is = is_80_;
			} catch (final RuntimeException runtimeexception) {
				throw GameCanvas.error(runtimeexception, "fs.a()");
			}
			return is;
		} while (false);
		return null;
	}

	FileStore(final boolean bool, final boolean bool_81_) {
		this.field_x_2477 = bool;
		this.discardChildren = bool_81_;
	}

	public byte[] method_h_byteArray(final int i, final int i_82_) {
		try {
			if (this.children.length == 1) {
				return getChildData(0, i);
			}
			if (this.children[i].length == 1) {
				return getChildData(i, 0);
			}
			throw new RuntimeException();
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.h()");
		}
	}

	public boolean method_g_boolean(final int i, final byte i_83_) {
		boolean bool;
		try {
			
			if (this.field_l_2483[i] != null) {
				return true;
			}
			method_l_void(i, -701605731);
			if (this.field_l_2483[i] != null) {
				return true;
			}
			bool = false;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.g()");
		}
		return bool;
	}

	static boolean method_em_boolean(final Widget widget, final int i) {
		boolean bool;
		try {
			if (client.field_jk_2857) {
				if (Class_db.method_en_int(widget, -1606977898) != 0) {
					return false;
				}
				if ((876728889 * widget.type) == 0) {
					return false;
				}
			}
			bool = widget.isHidden;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.em()");
		}
		return bool;
	}

	static final boolean method_n_boolean(final char c, final byte i) {
		boolean bool;
		try {
			if ((c != '\u00a0') && (c != ' ') && (c != '_') && (c != '-')) {
				return false;
			}
			bool = true;
		} catch (final RuntimeException runtimeexception) {
			throw GameCanvas.error(runtimeexception, "fs.n()");
		}
		return bool;
	}
}
