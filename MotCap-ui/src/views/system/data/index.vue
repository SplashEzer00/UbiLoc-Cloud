<template>
  <div class="app-container">
    <el-form :model="queryParams" ref="queryForm" :inline="true" v-show="showSearch" label-width="68px">
      <el-form-item label="用户ID" prop="userId">
        <el-input
          v-model="queryParams.userId"
          placeholder="请输入用户ID"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="用户名" prop="userName">
        <el-input
          v-model="queryParams.userName"
          placeholder="请输入用户名"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="A_Xmean" prop="aXmean">
        <el-input
          v-model="queryParams.aXmean"
          placeholder="请输入A_Xmean"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="A_Ymean" prop="aYmean">
        <el-input
          v-model="queryParams.aYmean"
          placeholder="请输入A_Ymean"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="A_Zmean" prop="aZmean">
        <el-input
          v-model="queryParams.aZmean"
          placeholder="请输入A_Zmean"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="A_Xstd" prop="aXstd">
        <el-input
          v-model="queryParams.aXstd"
          placeholder="请输入A_Xstd"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="A_Ystd" prop="aYstd">
        <el-input
          v-model="queryParams.aYstd"
          placeholder="请输入A_Ystd"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="A_Zstd" prop="aZstd">
        <el-input
          v-model="queryParams.aZstd"
          placeholder="请输入A_Zstd"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="G_Xmean" prop="gXmean">
        <el-input
          v-model="queryParams.gXmean"
          placeholder="请输入G_Xmean"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="G_Ymean" prop="gYmean">
        <el-input
          v-model="queryParams.gYmean"
          placeholder="请输入G_Ymean"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="G_Zmean" prop="gZmean">
        <el-input
          v-model="queryParams.gZmean"
          placeholder="请输入G_Zmean"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="G_Xstd" prop="gXstd">
        <el-input
          v-model="queryParams.gXstd"
          placeholder="请输入G_Xstd"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="G_Ystd" prop="gYstd">
        <el-input
          v-model="queryParams.gYstd"
          placeholder="请输入G_Ystd"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="G_Zstd" prop="gZstd">
        <el-input
          v-model="queryParams.gZstd"
          placeholder="请输入G_Zstd"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="部位" prop="part">
        <el-input
          v-model="queryParams.part"
          placeholder="请输入部位"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="模式" prop="state">
        <el-input
          v-model="queryParams.state"
          placeholder="请输入模式"
          clearable
          size="small"
          @keyup.enter.native="handleQuery"
        />
      </el-form-item>
      <el-form-item label="数据状态" prop="status">
        <el-select v-model="queryParams.status" placeholder="数据状态" clearable size="small">
          <el-option
            v-for="dict in statusOptions"
            :key="dict.dictValue"
            :label="dict.dictLabel"
            :value="dict.dictValue"
          />
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button type="cyan" icon="el-icon-search" size="mini" @click="handleQuery">搜索</el-button>
        <el-button icon="el-icon-refresh" size="mini" @click="resetQuery">重置</el-button>
      </el-form-item>
    </el-form>

    <el-row :gutter="10" class="mb8">
      <el-col :span="1.5">
        <el-button
          type="primary"
          icon="el-icon-plus"
          size="mini"
          @click="handleAdd"
          v-hasPermi="['system:data:add']"
        >新增</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="success"
          icon="el-icon-edit"
          size="mini"
          :disabled="single"
          @click="handleUpdate"
          v-hasPermi="['system:data:edit']"
        >修改</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="danger"
          icon="el-icon-delete"
          size="mini"
          :disabled="multiple"
          @click="handleDelete"
          v-hasPermi="['system:data:remove']"
        >删除</el-button>
      </el-col>
      <el-col :span="1.5">
        <el-button
          type="warning"
          icon="el-icon-download"
          size="mini"
          @click="handleExport"
          v-hasPermi="['system:data:export']"
        >导出</el-button>
      </el-col>
	  <right-toolbar :showSearch.sync="showSearch" @queryTable="getList"></right-toolbar>
    </el-row>

    <el-table v-loading="loading" :data="dataList" @selection-change="handleSelectionChange">
      <el-table-column type="selection" width="55" align="center" />
      <el-table-column label="数据ID" align="center" prop="dataId" />
      <el-table-column label="用户ID" align="center" prop="userId" />
      <el-table-column label="用户名" align="center" prop="userName" />
      <el-table-column label="A_Xmean" align="center" prop="aXmean" />
      <el-table-column label="A_Ymean" align="center" prop="aYmean" />
      <el-table-column label="A_Zmean" align="center" prop="aZmean" />
      <el-table-column label="A_Xstd" align="center" prop="aXstd" />
      <el-table-column label="A_Ystd" align="center" prop="aYstd" />
      <el-table-column label="A_Zstd" align="center" prop="aZstd" />
      <el-table-column label="G_Xmean" align="center" prop="gXmean" />
      <el-table-column label="G_Ymean" align="center" prop="gYmean" />
      <el-table-column label="G_Zmean" align="center" prop="gZmean" />
      <el-table-column label="G_Xstd" align="center" prop="gXstd" />
      <el-table-column label="G_Ystd" align="center" prop="gYstd" />
      <el-table-column label="G_Zstd" align="center" prop="gZstd" />
      <el-table-column label="部位" align="center" prop="part" />
      <el-table-column label="模式" align="center" prop="state" />
      <el-table-column label="数据状态" align="center" prop="status">
        <template slot-scope="scope">
          <el-switch
            v-model="scope.row.status"
            active-value="0"
            inactive-value="1"
            @change="handleStatusChange(scope.row)"
          ></el-switch>
        </template>
      </el-table-column>
      <el-table-column label="备注" align="center" prop="remark" />
      <el-table-column label="操作" align="center" class-name="small-padding fixed-width">
        <template slot-scope="scope">
          <el-button
            size="mini"
            type="text"
            icon="el-icon-edit"
            @click="handleUpdate(scope.row)"
            v-hasPermi="['system:data:edit']"
          >修改</el-button>
          <el-button
            size="mini"
            type="text"
            icon="el-icon-delete"
            @click="handleDelete(scope.row)"
            v-hasPermi="['system:data:remove']"
          >删除</el-button>
        </template>
      </el-table-column>
    </el-table>

    <pagination
      v-show="total>0"
      :total="total"
      :page.sync="queryParams.pageNum"
      :limit.sync="queryParams.pageSize"
      @pagination="getList"
    />

    <!-- 添加或修改三维数据对话框 -->
    <el-dialog :title="title" :visible.sync="open" width="500px" append-to-body>
      <el-form ref="form" :model="form" :rules="rules" label-width="80px">
        <el-form-item label="用户ID" prop="userId">
          <el-input v-model="form.userId" placeholder="请输入用户ID" />
        </el-form-item>
        <el-form-item label="用户名" prop="userName">
          <el-input v-model="form.userName" placeholder="请输入用户名" />
        </el-form-item>
        <el-form-item label="A_Xmean" prop="aXmean">
          <el-input v-model="form.aXmean" placeholder="请输入A_Xmean" />
        </el-form-item>
        <el-form-item label="A_Ymean" prop="aYmean">
          <el-input v-model="form.aYmean" placeholder="请输入A_Ymean" />
        </el-form-item>
        <el-form-item label="A_Zmean" prop="aZmean">
          <el-input v-model="form.aZmean" placeholder="请输入A_Zmean" />
        </el-form-item>
        <el-form-item label="A_Xstd" prop="aXstd">
          <el-input v-model="form.aXstd" placeholder="请输入A_Xstd" />
        </el-form-item>
        <el-form-item label="A_Ystd" prop="aYstd">
          <el-input v-model="form.aYstd" placeholder="请输入A_Ystd" />
        </el-form-item>
        <el-form-item label="A_Zstd" prop="aZstd">
          <el-input v-model="form.aZstd" placeholder="请输入A_Zstd" />
        </el-form-item>
        <el-form-item label="G_Xmean" prop="gXmean">
          <el-input v-model="form.gXmean" placeholder="请输入G_Xmean" />
        </el-form-item>
        <el-form-item label="G_Ymean" prop="gYmean">
          <el-input v-model="form.gYmean" placeholder="请输入G_Ymean" />
        </el-form-item>
        <el-form-item label="G_Zmean" prop="gZmean">
          <el-input v-model="form.gZmean" placeholder="请输入G_Zmean" />
        </el-form-item>
        <el-form-item label="G_Xstd" prop="gXstd">
          <el-input v-model="form.gXstd" placeholder="请输入G_Xstd" />
        </el-form-item>
        <el-form-item label="G_Ystd" prop="gYstd">
          <el-input v-model="form.gYstd" placeholder="请输入G_Ystd" />
        </el-form-item>
        <el-form-item label="G_Zstd" prop="gZstd">
          <el-input v-model="form.gZstd" placeholder="请输入G_Zstd" />
        </el-form-item>
        <el-form-item label="部位" prop="part">
          <el-input v-model="form.part" placeholder="请输入部位" />
        </el-form-item>
        <el-form-item label="模式" prop="state">
          <el-input v-model="form.state" placeholder="请输入模式" />
        </el-form-item>
        <el-form-item label="状态">
          <el-radio-group v-model="form.status">
            <el-radio
              v-for="dict in statusOptions"
              :key="dict.dictValue"
              :label="dict.dictValue"
            >{{dict.dictLabel}}</el-radio>
          </el-radio-group>
        </el-form-item>
        <el-form-item label="备注" prop="remark">
          <el-input v-model="form.remark" type="textarea" placeholder="请输入内容" />
        </el-form-item>
      </el-form>
      <div slot="footer" class="dialog-footer">
        <el-button type="primary" @click="submitForm">确 定</el-button>
        <el-button @click="cancel">取 消</el-button>
      </div>
    </el-dialog>
  </div>
</template>

<script>
import { listData, getData, delData, addData, updateData } from "@/api/system/data";

export default {
  name: "Data",
  components: {
  },
  data() {
    return {
      // 遮罩层
      loading: true,
      // 选中数组
      ids: [],
      // 非单个禁用
      single: true,
      // 非多个禁用
      multiple: true,
      // 显示搜索条件
      showSearch: true,
      // 总条数
      total: 0,
      // 三维数据表格数据
      dataList: [],
      // 状态数据字典
      statusOptions: [],
      // 弹出层标题
      title: "",
      // 是否显示弹出层
      open: false,
      // 查询参数
      queryParams: {
        pageNum: 1,
        pageSize: 10,
        userId: null,
        userName: null,
        aXmean: null,
        aYmean: null,
        aZmean: null,
        aXstd: null,
        aYstd: null,
        aZstd: null,
        gXmean: null,
        gYmean: null,
        gZmean: null,
        gXstd: null,
        gYstd: null,
        gZstd: null,
        part: null,
        state: null,
        status: null,
      },
      // 表单参数
      form: {},
      // 表单校验
      rules: {
        userId: [
          { required: true, message: "用户ID不能为空", trigger: "blur" }
        ],
        userName: [
          { required: true, message: "用户名不能为空", trigger: "blur" }
        ],
      }
    };
  },
  created() {
    this.getList();
    this.getDicts("sys_normal_disable").then(response => {
      this.statusOptions = response.data;
    });
  },
  methods: {
    /** 查询三维数据列表 */
    getList() {
      this.loading = true;
      listData(this.queryParams).then(response => {
        this.dataList = response.rows;
        this.total = response.total;
        this.loading = false;
      });
    },
    // 取消按钮
    cancel() {
      this.open = false;
      this.reset();
    },
    // 表单重置
    reset() {
      this.form = {
        dataId: null,
        userId: null,
        userName: null,
        aXmean: null,
        aYmean: null,
        aZmean: null,
        aXstd: null,
        aYstd: null,
        aZstd: null,
        gXmean: null,
        gYmean: null,
        gZmean: null,
        gXstd: null,
        gYstd: null,
        gZstd: null,
        part: null,
        state: null,
        status: "0",
        createTime: null,
        updateTime: null,
        remark: null
      };
      this.resetForm("form");
    },
    /** 搜索按钮操作 */
    handleQuery() {
      this.queryParams.pageNum = 1;
      this.getList();
    },
    /** 重置按钮操作 */
    resetQuery() {
      this.resetForm("queryForm");
      this.handleQuery();
    },
    // 多选框选中数据
    handleSelectionChange(selection) {
      this.ids = selection.map(item => item.dataId)
      this.single = selection.length!==1
      this.multiple = !selection.length
    },
    /** 新增按钮操作 */
    handleAdd() {
      this.reset();
      this.open = true;
      this.title = "添加三维数据";
    },
    /** 修改按钮操作 */
    handleUpdate(row) {
      this.reset();
      const dataId = row.dataId || this.ids
      getData(dataId).then(response => {
        this.form = response.data;
        this.open = true;
        this.title = "修改三维数据";
      });
    },
    /** 提交按钮 */
    submitForm() {
      this.$refs["form"].validate(valid => {
        if (valid) {
          if (this.form.dataId != null) {
            updateData(this.form).then(response => {
              this.msgSuccess("修改成功");
              this.open = false;
              this.getList();
            });
          } else {
            addData(this.form).then(response => {
              this.msgSuccess("新增成功");
              this.open = false;
              this.getList();
            });
          }
        }
      });
    },
    /** 删除按钮操作 */
    handleDelete(row) {
      const dataIds = row.dataId || this.ids;
      this.$confirm('是否确认删除三维数据编号为"' + dataIds + '"的数据项?', "警告", {
          confirmButtonText: "确定",
          cancelButtonText: "取消",
          type: "warning"
        }).then(function() {
          return delData(dataIds);
        }).then(() => {
          this.getList();
          this.msgSuccess("删除成功");
        })
    },
    /** 导出按钮操作 */
    handleExport() {
      this.download('system/data/export', {
        ...this.queryParams
      }, `system_data.xlsx`)
    },

    // 用户状态修改
    handleStatusChange(row) {
      let text = row.status === "0" ? "启用" : "停用";
      this.$confirm('确认要"' + text + '""' + row.userName + '"用户的数据吗?', "警告", {
        confirmButtonText: "确定",
        cancelButtonText: "取消",
        type: "warning"
      }).then(function() {
        return changeUserStatus(row.userId, row.status);
      }).then(() => {
        this.msgSuccess(text + "成功");
      }).catch(function() {
        row.status = row.status === "0" ? "1" : "0";
      });
    }
  }
};
</script>
